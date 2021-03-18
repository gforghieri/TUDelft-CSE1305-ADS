n this exercise you need to implement the following methods for a multi-way search tree:

        getCousin(MultiWaySearchTree tree, MWSTNode node)
        getUncle(MultiWaySearchTree tree, MWSTNode node)
        restrictedSearch(MultiWaySearchTree tree, int key)
        The method getCousin(MultiWaySearchTree tree, MWSTNode node), takes as input the multi-way search tree and a node within this tree, and returns as output the nearest right cousin of the node. The algorithm returns null if no such node can be found. Where a cousin is a child of your parent’s siblings.

        The method getUncle(MultiWaySearchTree tree, MWSTNode node), takes as input the multi-way search tree and a node within this tree, and returns as output the farthest left uncle of the node. The algorithm returns null if no such node can be found. Where an uncle is a sibling of your parent.

        The method restrictedSearch(MultiWaySearchTree tree, int key), takes as input the multi-way search tree and an integer, and returns as output true if the key can be found within the first 3 layers of the tree.

        For all three methods, you need to make sure that you visit only the minimum number of nodes necessary to find the node in question (or determine that such node does not exist)

        An example MultiWaySearchTree:

        root: [  24  42   80 ]
        /    |     \     \
        /     |      \     \
        /      |       \     \
        /       |        \     \
        G:[5 8 10]  E:[31 38]   C:[70] D:[100]
        |          |  \          \
        |          |   \          \
        |          |    \          \
        B:[6]      H:[33 37] A:[39]   F:[75]
        |
        |
        |
        [34]
        \
        \
        \
        [36]
        /
        /
        /
        [35]
        Calling getCousin(tree, B), where B is the node with the key 6, will result in node H.

        Calling getUncle(tree, F), where F is the node with the key 75, will result in node G.

        Calling restrictedSearch(tree, 33), will result in true, whereas calling restrictedSearch(tree, 34) will result in false.

        Below you can find an overview of the methods in the class MultiWaySearchTree and MWSTNode. The complete implementation can be found in the library code.
        Example instances of MultiWaySearchTrees can be found in the tests.

class MultiWaySearchTree {

    // Creates a MWST with the specified node as the root
    public MultiWaySearchTree(MWSTNode root);

    public MWSTNode getRoot();

    public void setRoot(MWSTNode root);
}

class MWSTNode {

    // Creates a MWSTNode with the specified keys, with references to the parent and children.
    public MWSTNode(List<Integer> keys, MWSTNode parent, LinkedList<MWSTNode> children);

    public List<Integer> getKeys();

    public void setKeys(List<Integer> keys);

    public MWSTNode getParent();

    public void setParent(MWSTNode parent);

    public LinkedList<MWSTNode> getChildren();

    public void setChildren(LinkedList<MWSTNode> children);

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();
}
IMPORTANT:

        Your solution will be manually checked to see if you have actually implemented the exercise and have not cheated the spec-test system in any way. Depending on that, points may be deducted.