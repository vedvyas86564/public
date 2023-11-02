import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class TestBFS {
    public static void main(String[] args) {
        Vertex<Integer> initial = createGraph();
        breadthFirstSearch(initial, 5);
    }
    private static Vertex<Integer> createGraph() {
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);
        v1.addNeighbour(v6);
        v1.addNeighbour(v2);
        v2.addNeighbour(v3);

        v3.addNeighbour(v4);

        v4.addNeighbour(v5);

        return v1;
    }

    private static void breadthFirstSearch(Vertex<Integer> initial, int elementToFind) {
        Queue<Vertex<Integer>> queue = new LinkedBlockingQueue<>();
        Map<Vertex<Integer>, Void> visited = new HashMap<>();
//        Vertex<Integer> ved= new Vertex<>(5);
        queue.add(initial);
        while(!queue.isEmpty()) {
            Vertex<Integer> v = queue.poll();
            if(!checkVertex(v, elementToFind)) {
                List<Vertex<Integer>> neighbors = v.getNeighbors();
                List<Vertex<Integer>> nonVisitedNeighbours = extractEligibleNeighbours(visited, neighbors);
                queue.addAll(nonVisitedNeighbours);
                addVisited(visited, nonVisitedNeighbours);
            }
            else {
                System.out.println("element found");
                break;
            }
        }
    }

    private static void addVisited(Map<Vertex<Integer>, Void> visited, List<Vertex<Integer>> nonVisitedNeighbours) {
        for (Vertex<Integer> nonVisitedNeighbour : nonVisitedNeighbours) {
            visited.put(nonVisitedNeighbour, null);
        }
    }

    private static List<Vertex<Integer>> extractEligibleNeighbours(Map<Vertex<Integer>, Void> visited, List<Vertex<Integer>> neighbors) {
        List<Vertex<Integer>> notVisited = new ArrayList<>();
        for (Vertex<Integer> neighbor : neighbors) {
            if(!isVisited(visited, neighbor)) {
                notVisited.add(neighbor);
            }
        }
        return notVisited;
    }

    private static boolean isVisited(Map<Vertex<Integer>, Void> visited, Vertex<Integer> vertex) {
        return visited.containsKey(vertex);
    }

    private static boolean checkVertex(Vertex<Integer> vertex, int eleToFind) {
        int ele = vertex.getEle();
        return ele == eleToFind;
    }
}
