package final2018_2019A.Graph;

import static org.junit.Assert.*;

import org.junit.*;

public class CountConnectedComponentsTest {

//   @Test
//   public void testNull() {
//     Graph g = new Graph();
//     Graph.Vertex v = null;
//     assertEquals(0, CountConnectedComponents.countVertices(g, v));
//     g = null;
//     v = new Graph.Vertex(1);
//     assertEquals(0, CountConnectedComponents.countVertices(g, v));
//   }

    @Test
    public void testExample() {
        Graph g = new Graph();
        Graph.Vertex v = new Graph.Vertex(1);
        Graph.Vertex w = new Graph.Vertex(2);
        Graph.Vertex x = new Graph.Vertex(3);
        Graph.Vertex y = new Graph.Vertex(4);
        g.addVertex(v);
        g.addVertex(w);
        g.addVertex(x);
        g.addVertex(y);
        g.addEdge(v, w);
        g.addEdge(w, y);
         assertEquals(3, CountConnectedComponents.countVertices(g, v));
        assertEquals(3, CountConnectedComponents.countVertices(g, w));
         assertEquals(3, CountConnectedComponents.countVertices(g, y));
         assertEquals(1, CountConnectedComponents.countVertices(g, x));
    }
}

