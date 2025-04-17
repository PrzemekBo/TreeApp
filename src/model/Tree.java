package model;

import growable.Growable;

import java.util.ArrayList;
import java.util.List;

public abstract class Tree implements Growable {
    protected Trunk trunk;
    protected List<Branch> branches;

    public Tree() {
        this.trunk = new Trunk();
        this.branches = new ArrayList<>();
        growInitialBranches();
    }

    protected abstract void growInitialBranches();

    public void describe() {
        System.out.println("Pień: " + trunk.getDescription());
        System.out.println("Liczba gałęzi: " + branches.size());
        for (Branch branch : branches) {
            System.out.println(" - Gałąź: " + branch.getDescription());
        }
    }
}