package final2018_2019A.Graph;

import java.util.*;


public class CountConnectedComponents {

    /**
     * Counts the number of vertices in the same connected component as v in graph g.
     * This is done using depth first search.
     * <p>
     * Returns 0 if the graph or vertex is null
     *
     * @param g The graph to count vertices in.
     * @param v The vertex to start counting at.
     * @return the number of vertices in the same connected component.
     */
    public static int countVertices(Graph g, Graph.Vertex v) {
        if (g == null || v == null) return 0;
        ArrayList<Integer> visitedIds = new ArrayList<Integer>();
        visitedIds = depthFirstSearch(g, v, visitedIds);
        return visitedIds.size();
    }

    // Recursive DFS with counting connected vertices.
    public static ArrayList<Integer> depthFirstSearch(Graph g, Graph.Vertex v, ArrayList<Integer> visitedIds) {
        Stack<Graph.Vertex> stack = new Stack<Graph.Vertex>();
        stack.add(v);
        while (!stack.isEmpty()) {
            Graph.Vertex element = stack.pop();
            if (!visitedIds.contains(element.getId())) {
                System.out.println(element.getId());
                visitedIds.add(element.getId());
            }
            List<Graph.Vertex> neighbours = g.getNeighbours(element);
            for (Graph.Vertex neighbour: neighbours) {
                if (!visitedIds.contains(neighbour.getId())) stack.add(neighbour);
            }
        }
        return visitedIds;
    }
}