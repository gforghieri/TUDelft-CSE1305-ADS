package week2.tutorials;

import java.util.List;
import java.util.Objects;

class Street {

    private String[] inhabitants;

    public Street(int n) {
        this.inhabitants = new String[n];
    }

    public Street(List<String> inhabitants) {
        this.inhabitants = new String[inhabitants.size()];
        for (int i = 0; i < inhabitants.size(); i++) {
            this.inhabitants[i] = inhabitants.get(i);
        }
    }

    public String getNeighbour(int i) throws IllegalArgumentException {
        if (i < 0 || i >= inhabitants.length) {
            throw new IllegalArgumentException("No neighbour at that index.");
        }
        return this.inhabitants[i];
    }

    public void removeNeighbour(int i) throws IllegalArgumentException {
        if (i < 0 || i >= inhabitants.length) {
            throw new IllegalArgumentException("No neighbour at that index.");
        }
        this.inhabitants[i] = null;
    }

    public void addNeighbour(int i, String neighbour) throws IllegalArgumentException {
        if (i < 0 || i >= inhabitants.length) {
            throw new IllegalArgumentException("No neighbour at that index.");
        }
        this.inhabitants[i] = neighbour;
    }

    public int size() {
        return this.inhabitants.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.inhabitants.length; i++) {
            sb.append(i);
            sb.append(": ");
            sb.append(this.inhabitants[i]);
            sb.append("\n");
        }
        return sb.toString();
    }
}

class House {

    private int houseNumber;

    private String owner;

    public House(int houseNumber, String owner) {
        this.houseNumber = houseNumber;
        this.owner = owner;
    }

    public String toString() {
        return this.houseNumber + ": " + owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        House house = (House) o;
        return houseNumber == house.houseNumber && Objects.equals(owner, house.owner);
    }
}

