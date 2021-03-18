package final2020_2021;

import java.util.*;

class Path implements Comparable<Path> {

    private int from;

    private int to;

    private int coatis;

    /**
     * Represents a flight path from `from` to `to` with `coatis` coatis.
     *
     * @param from   ID of the house on one side.
     * @param to     ID of the house on the other side.
     * @param coatis Amount of coatis on this path.
     */
    public Path(int from, int to, int coatis) {
        this.from = from;
        this.to = to;
        this.coatis = coatis;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getCoatis() {
        return coatis;
    }

    /**
     * Compares the amount of coatis of this path to that on another.
     *
     * @param o Path to compare to.
     * @return -1 if `this` path has fewer coatis, 1 if it has more, or 0 if both have an equal amount of coatis.
     */
    @Override
    public int compareTo(Path o) {
        return Integer.compare(this.coatis, o.coatis);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Path path = (Path) o;
        return ((from == path.from && to == path.to) || (from == path.to && to == path.from)) && coatis == path.coatis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.min(from, to), Math.max(from, to), coatis);
    }

    @Override
    public String toString() {
        return "Path{" + "from=" + from + ", to=" + to + ", coatis=" + coatis + '}';
    }
}

class UnionFind {

    private int[] parent;

    private int[] rank;

    /**
     * Union Find structure implemented with two arrays for Union by Rank.
     *
     * @param size Size of the UF structure.
     */
    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) parent[i] = i;
    }

    /**
     * Merges two clusters, if they are not already part of the same cluster.
     *
     * @param i a node in the first cluster
     * @param j a node in the second cluster
     * @return true iff the merge was successful.
     */
    boolean union(int i, int j) {
        int parent1 = find(i);
        int parent2 = find(j);
        if (parent2 == parent1)
            return false;
        if (rank[parent1] > rank[parent2]) {
            parent[parent2] = parent1;
        } else if (rank[parent2] > rank[parent1]) {
            parent[parent1] = parent2;
        } else {
            parent[parent2] = parent1;
            rank[parent1]++;
        }
        return true;
    }

    /**
     * @param i index of a node
     * @return the root of the subtree containing i.
     */
    int find(int i) {
        int parent = this.parent[i];
        if (i == parent) {
            return i;
        }
        return this.parent[i] = find(parent);
    }

    /**
     * @return the ranks of the trees.
     */
    public int[] getRank() {
        return rank;
    }

    /**
     * @return the parents of the trees
     */
    public int[] getParent() {
        return parent;
    }
}
