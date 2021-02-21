package final2018_2019A.Tree;

import static org.junit.Assert.*;

import org.junit.*;

public class TreeTest {


    @Test
    public void testSmall() {
        BinaryTree tree = new BinaryTree(0, new BinaryTree(1, new BinaryTree(3), new BinaryTree(4)), new BinaryTree(2, new BinaryTree(5), new BinaryTree(6)));
        assertEquals(1, Tree.countNodesAtLevel(tree, 0));
    }

    @Test
    public void testSmall1() {
        BinaryTree tree = new BinaryTree(0, new BinaryTree(1, new BinaryTree(3), new BinaryTree(4)), new BinaryTree(2, new BinaryTree(5), new BinaryTree(6)));
        assertEquals(2, Tree.countNodesAtLevel(tree, 1));
    }

    @Test
    public void testSmall2() {
        BinaryTree tree = new BinaryTree(0, new BinaryTree(1, new BinaryTree(3), new BinaryTree(4)), new BinaryTree(2, new BinaryTree(5), new BinaryTree(6)));
        assertEquals(4, Tree.countNodesAtLevel(tree, 2));
    }


    @Test
    public void testNull() {
        BinaryTree tree = null;
        assertEquals(0, Tree.countNodesAtLevel(tree, 0));
    }
}
