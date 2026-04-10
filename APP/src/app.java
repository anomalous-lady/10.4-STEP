import java.util.ArrayList;
import java.util.List;

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
        // UC10 STARTS HERE
        // =========================

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBogies:");
        System.out.println(bogies);

        // Calculate total capacity using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum);  // sum all

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // Check original list unchanged
        System.out.println("\nOriginal Bogies After Calculation:");
        System.out.println(bogies);
    }
}