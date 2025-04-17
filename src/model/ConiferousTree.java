package model;

public class ConiferousTree extends Tree {

    @Override
    protected void growInitialBranches() {
        for (int i = 0; i < 4; i++) {
            branches.add(new Branch(new Leaf("igła")));
        }
    }

    @Override
    public void grow() {
        branches.add(new Branch(new Leaf("igła")));
        System.out.println("Drzewo iglaste wypuściło nową gałąź z igłą.");
    }
}