from state import Jug


class Operator:
    def __init__(self, from_, to):
        self.from_ = from_
        self.to = to

    def precondition_fulfilled(self, Jug):
        return Jug.contents[self.from_] != 0 and Jug.contents[self.to] != Jug.CAPACITIES[self.to]
    
    def use(self, Jug):
        result = Jug

        volume = min(Jug.contents[self.from_], 
                     Jug.CAPACITIES[self.to - Jug.contents[self.to]])
        
        index_untouched = next(filter(lambda i: i not in (self.from_, self.to),
                                 Jug.INDICES))
        
        result.contents[self.from_] = Jug.contents[self.from_] - volume

        result.contents[self.to] = Jug.contents[self.to] + volume

        result.contents[index_untouched] = Jug.contents[index_untouched]

        return result
    
    def __str__(self):
        return f"Operator [From={self.from_}, To={self.to}]"
        
if __name__ == "__main__":
    o1 = Operator(from_=0, to=1)

    print("o1: ", o1)

    Jug = Jug([2, 0, 3])

    print("_______________"*30)

    print("Jug:", Jug)
    print("Precondition:", o1.precondition_fulfilled(Jug))
    print("After:", o1.use(Jug))