import java.util.HashSet;

public class Graph {

    private HashSet<Node> nodes;

    private HashSet<Edge> edges;

    public Graph() {
        this.nodes = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public HashSet<Node> getNodes() {
        return nodes;
    }

    public void setNodes(HashSet<Node> nodes) {
        this.nodes = nodes;
    }

    public HashSet<Edge> getEdges() {
        return edges;
    }

    public void setEdges(HashSet<Edge> edges) {
        this.edges = edges;
    }

    public void addNode(Node node){
        this.nodes.add(node);
    }

    public String addEdge(Edge edge) {
        boolean isNode1Exists = false;
        boolean isNode2Exists = false;

        for (Node node : nodes) {
            if (node.getId() == edge.getNodeId1()) {
                isNode1Exists = true;
            }
            if (node.getId() == edge.getNodeId2()) {
                isNode2Exists = true;
            }
        }
        if (isNode1Exists && isNode2Exists) {
            this.edges.add(edge);
            return "Okey";
        }
        return "not okey";
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }
}
