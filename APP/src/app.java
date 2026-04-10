import java.util.*;
import java.util.stream.Collectors;

// Reuse Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC9 STARTS HERE
        // =========================

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("Sleeper", 72)); // duplicate type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 54));

        System.out.println("\nOriginal Bogies:");
        System.out.println(bogies);

        // Group by bogie name (type)
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check original list unchanged
        System.out.println("\nOriginal Bogies After Grouping:");
        System.out.println(bogies);
    }
}