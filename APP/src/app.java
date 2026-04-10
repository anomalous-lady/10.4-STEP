import java.util.LinkedHashSet;
import java.util.Set;

public class app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC5 STARTS HERE
        // =========================

        // Create LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        trainFormation.add("Sleeper"); // will be ignored

        // Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);
    }
}