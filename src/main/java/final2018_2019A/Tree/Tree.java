package final2018_2019A.Tree;

public class Tree {

    /**
     * Counts the number of nodes in the tree at a certain level.
     *
     * @param tree  The binary tree to count nodes in.
     * @param level The specified level to count nodes in.
     * @return the number of nodes at that level, or 0 if tree is null.
     */
    public static int countNodesAtLevel(BinaryTree tree, int level) {
        if (tree == null) return 0;
        int leftCount = 0;
        int rightCount = 0;
        int trackLevel = 0;
        int totalCount = 0;
        totalCount = traversePreOrder(tree, level, trackLevel, leftCount, rightCount);
        return totalCount;
    }

    public static int traversePreOrder(BinaryTree tree, int level, int trackLevel, int leftCount, int rightCount) {
        if (tree == null) return 0;
        if (trackLevel == level) {
            trackLevel = 0;
            return 1;
        }

        leftCount += traversePreOrder(tree.getLeft(), level, trackLevel + 1, leftCount, rightCount);
        rightCount += traversePreOrder(tree.getRight(), level, trackLevel + 1, rightCount, rightCount);
        return leftCount+rightCount;
    }
}
