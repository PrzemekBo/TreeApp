package model;

public class Branch {
    private final Leaf leaf;

    public Branch(Leaf leaf) {
        this.leaf = leaf;
    }

    public String getDescription() {
        return "Z liściem typu: " + leaf.getType();
    }
}