//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import growable.Growable;

import model.ConiferousTree;
import model.DeciduousTree;
import model.Tree;
import simulator.ForestSimulator;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree oak = new DeciduousTree();
        Tree pine = new ConiferousTree();

        System.out.println("=== Przed wzrostem ===");
        oak.describe();
        pine.describe();

        // Symulacja wzrostu
        ForestSimulator simulator = new ForestSimulator();
        List<Growable> growables = Arrays.asList(oak, pine);
        simulator.simulateGrowth(growables);

        System.out.println("\n=== Po wzroście ===");
        oak.describe();
        pine.describe();
    }
}