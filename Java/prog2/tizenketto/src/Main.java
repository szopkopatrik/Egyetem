public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(new Node<>(0,new Cat("Cirmi")));
        graph.addNode(new Node(1,new Dolphin("Peti")));
        graph.addNode(new Node<>(2,new Cat("Golyó")));

        graph.addEdge(new Edge<>(0,1, new Friend(6)));
        graph.addEdge(new Edge<>(0,2, new Friend(8)));
        graph.addEdge(new Edge<>(1,2, new Transaction(10)));
        System.out.println(graph.addEdge(new Edge<>(0,2, new Friend(6))));

        System.out.println(graph);
    }
}