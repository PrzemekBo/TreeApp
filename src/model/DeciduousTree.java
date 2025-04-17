package model;

public class DeciduousTree extends Tree {

    @Override
    protected void growInitialBranches() {
        for (int i = 0; i < 3; i++) {
            branches.add(new Branch(new Leaf("zielony liść")));
        }
    }

    @Override
    public void grow() {
        branches.add(new Branch(new Leaf("zielony liść")));
        System.out.println("Drzewo liściaste wypuściło nową gałąź z liściem.");
    }
}