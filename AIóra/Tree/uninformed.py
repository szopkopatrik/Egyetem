import time


def get_solution(goal_node):
    history = []

    n = goal_node

    while n is not None:
        history.append(n.operator)
        n = n.parent

    return history[::-1]

class BackTrackNode:
    def __init__(self,state, parent, operator, applicable):
        self.state = state
        self.parent = parent
        self.operator = operator
        self.applicable = applicable

    def __str__(self):
        return f"BackTrackNode [state={self.state}, operator={self.operator}]"
    
class BackTrack:
    def __init__(self, delay_seconds):
        self.delay_seconds = delay_seconds

    def search(self,start_state, operators):
        actual_node = BackTrackNode(
            state = start_state,
            parent=None,
            operator=None,
            applicable=list(filter(lambda o: o.precondition_fulfilled(start_state),operators))
            )
    
        while True:
            if actual_node is None:
                break

            if actual_node is goal_state():
                break

            if len(actual_node.applicable) > 0:
                operator = actual_node.applicable[0]
                actual_node.applicable = [o for o in actual_node.applicable if o != operator]

                new_node = BackTrackNode(
                    state= operator.use(actual_node.state),
                    parent= actual_node,
                    operator=operator,
                    applicable=None
                )
                new_node.applicable = list(filter(lambda o: o.precondition_fulfilled(new_node.state), operator))

                actual_node = new_node;
            else:
                actual_node = actual_node.parent

            time.sleep(self.delay_seconds)
            print("Actual node:", actual_node)

        if actual_node is not None:
            print("Solution found:")
            print(get_solution(actual_node))
        else:
            print("No solution found during search.")

        return actual_node
    
class BackTrackWithCricleMonitoring:
    def __init__(self, delay_seconds):
        self.delay_seconds = delay_seconds
        self.history = []

    def seen_already(self, state):
        return state in self.history

    def search(self,start_state, operators):
        actual_node = BackTrackNode(
            state = start_state,
            parent=None,
            operator=None,
            applicable=list(filter(lambda o: o.precondition_fulfilled(start_state),operators))
            )
    
        while True:
            if actual_node is goal_state():
                break

            if(self.seen_already(actual_node.state)):
                actual_node = actual_node.parent

            if actual_node is None:
                break

            self.history.append(actual_node.state)

            if len(actual_node.applicable) > 0:
                operator = actual_node.applicable[0]
                actual_node.applicable = [o for o in actual_node.applicable if o != operator]

                new_node = BackTrackNode(
                    state= operator.use(actual_node.state),
                    parent= actual_node,
                    operator=operator,
                    applicable=None
                )
                new_node.applicable = list(filter(lambda o: o.precondition_fulfilled(new_node.state), operator))

                actual_node = new_node;
            else:
                actual_node = actual_node.parent

            time.sleep(self.delay_seconds)
            print("Actual node:", actual_node)

        if actual_node is not None:
            print("Solution found:")
            print(get_solution(actual_node))
        else:
            print("No solution found during search.")

        return actual_node