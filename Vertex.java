import java.util.*;

public class Vertex<T> {
    private T ele;
    private List<Vertex<T>> neighbors;

    private Map<Vertex<T>, Void> visited;

    public Vertex(T ele) {
        this.ele = ele;
        this.neighbors = new ArrayList<>();
        this.visited = new HashMap<>();
    }

    public void addNeighbour(Vertex<T> neighbour) {
        neighbors.add(neighbour);
    }
    public void addNeighbour(List<Vertex<T>> neighbours) {
        neighbors.addAll(neighbours);
    }
    public T getEle() {
        return this.ele;
    }

    public List<Vertex<T>> getNeighbors() {
        return this.neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "ele=" + ele +
                ", neighbors=" + neighbors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(ele, vertex.ele) && Objects.equals(neighbors, vertex.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ele, neighbors);
    }
}
