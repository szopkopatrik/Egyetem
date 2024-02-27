import java.util.Objects;

public class Edge<U> implements Relationship {
    private int nodeId1;
    private int nodeId2;
    private U data;

    public Edge(int nodeId1, int getNodeId2, U data) {
        this.nodeId1 = nodeId1;
        this.nodeId2 = getNodeId2;
        this.data = data;
    }

    public int getNodeId1() {
        return nodeId1;
    }

    public void setNodeId1(int nodeId1) {
        this.nodeId1 = nodeId1;
    }

    public int getNodeId2() {
        return nodeId2;
    }

    public void setNodeId2(int nodeId2) {
        this.nodeId2 = nodeId2;
    }

    public U getData() {
        return data;
    }

    public void setData(U data) {
        this.data = data;
    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge<?> edge = (Edge<?>) o;

        if (nodeId1 != edge.nodeId1) return false;
        if (nodeId2 != edge.nodeId2) return false;
        return Objects.equals(data, edge.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId1,nodeId2) ;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "nodeId1=" + nodeId1 +
                ", getNodeId2=" + nodeId2 +
                ", data=" + data +
                '}';
    }
}
