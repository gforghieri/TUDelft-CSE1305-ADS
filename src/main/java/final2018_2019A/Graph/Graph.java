package final2018_2019A.Graph;

import java.util.*;

public class Graph {
    static class Vertex {
        private int id;
        private Set<Vertex> neighbours;

        public Vertex(int id) {
            this.id = id;
            neighbours = new HashSet<>();
        }

        public void addNeighbour(Vertex v) {
            neighbours.add(v);
        }

        private Collection<Vertex> getNeighbours() {
            return new ArrayList<>(this.neighbours);
        }

        public int getId() {
            return this.id;
        }
    }

    Map<Integer, Vertex> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        this.vertices.put(v.getId(), v);
    }

    public Collection<Vertex> getAllVertices() {
        return new ArrayList<>(this.vertices.values());
    }

    public List<Vertex> getNeighbours(Vertex v) {
        List<Vertex> neigh = new ArrayList<>(((Vertex) v).getNeighbours());
        return neigh;
    }

    public void addEdge(Vertex v, Vertex w) {
        v.addNeighbour(w);
        w.addNeighbour(v);
    }
}

