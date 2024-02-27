import java.util.Objects;

public class Node<T> implements Animal {
    private int id;
    private T data;

    public Node(int id, T data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public T getData(){
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (id != node.id) return false;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }
}
