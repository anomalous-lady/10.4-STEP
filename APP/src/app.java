import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reuse Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC8 STARTS HERE
        // =========================

        // Create bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nOriginal Bogies:");
        System.out.println(bogies);

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        System.out.println(filteredBogies);

        // Check original list unchanged
        System.out.println("\nOriginal Bogies After Filtering (unchanged):");
        System.out.println(bogies);

        // Program continues...
    }
}