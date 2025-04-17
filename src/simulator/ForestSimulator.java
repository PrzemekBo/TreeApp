package simulator;

import growable.Growable;

import java.util.List;

public class ForestSimulator {

    public void simulateGrowth(List<Growable> growables) {
        System.out.println("Symulacja wzrostu:");
        for (Growable g : growables) {
            g.grow();
        }
    }
}