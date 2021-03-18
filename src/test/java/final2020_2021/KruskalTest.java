package final2020_2021;

import static org.junit.Assert.*;

import java.util.*;
import java.util.stream.*;

import org.junit.*;

public class KruskalTest {

    /**
     * Helper method to make creating set easier.
     *
     * @param elements Elements to put into the set
     * @return A new set with the given elements.
     */
    private Set<Integer> setOf(Integer... elements) {
        return Arrays.stream(elements).collect(Collectors.toSet());
    }

    @Test
    public void emptyVillage() {
        Set<Path> solution = Kruskal.relocateTheOwls(new ArrayList<>(), new HashSet<>());
        assertTrue("An empty village requires no flights to be made", solution.isEmpty());
    }

    @Test
    public void disconnectedVillage() {
        List<Map<Integer, Integer>> input = new ArrayList<>();
        input.add(new HashMap<>());
        input.add(new HashMap<>());
        assertNull("A disconnected village should give no solution", Kruskal.relocateTheOwls(input, setOf(0, 1)));
    }

    /**
     * Village: https://i.imgur.com/BdvaXpV.png
     * Expected flight paths used: https://i.imgur.com/RS9poLa.png
     */
    @Test
    public void completeGraph() {
        List<Map<Integer, Integer>> graph = new ArrayList<>();
        for (int x = 0; x < 6; x++) graph.add(new HashMap<>());
        graph.get(0).put(1, 1);
        graph.get(0).put(2, 1);
        graph.get(1).put(2, 2);
        graph.get(1).put(3, 3);
        graph.get(3).put(4, 2);
        graph.get(3).put(5, 1);
        graph.get(4).put(5, 1);
        Set<Path> solution = new HashSet<>();
        solution.add(new Path(0, 1, 1));
        solution.add(new Path(0, 2, 1));
        solution.add(new Path(1, 3, 3));
        solution.add(new Path(3, 5, 1));
        solution.add(new Path(4, 5, 1));
        assertEquals(solution, Kruskal.relocateTheOwls(graph, setOf(0, 1, 2, 3, 4, 5)));
    }

    /**
     * Same village as above, but house 5 is no longer an owl house
     */
    @Test
    public void completeGraphForbidden() {
        List<Map<Integer, Integer>> graph = new ArrayList<>();
        for (int x = 0; x < 6; x++) graph.add(new HashMap<>());
        graph.get(0).put(1, 1);
        graph.get(0).put(2, 1);
        graph.get(1).put(2, 2);
        graph.get(1).put(3, 3);
        graph.get(3).put(4, 2);
        graph.get(3).put(5, 1);
        graph.get(4).put(5, 1);
        Set<Path> solution = new HashSet<>();
        solution.add(new Path(0, 1, 1));
        solution.add(new Path(0, 2, 1));
        solution.add(new Path(1, 3, 3));
        solution.add(new Path(3, 4, 2));
        assertEquals(solution, Kruskal.relocateTheOwls(graph, setOf(0, 1, 2, 3, 4)));
    }
}
