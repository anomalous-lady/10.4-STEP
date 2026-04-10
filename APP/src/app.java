import java.util.*;

// ✅ Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ✅ Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    public void display() {
        System.out.println(type + " Bogie | Capacity: " + capacity);
    }
}

// ✅ Main Application
public class app {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // ✅ Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);
            PassengerBogie b3 = new PassengerBogie("First Class", 24);

            bogies.add(b1);
            bogies.add(b2);
            bogies.add(b3);

            // ❌ Invalid bogie (should throw exception)
            PassengerBogie b4 = new PassengerBogie("Invalid Bogie", 0);
            bogies.add(b4); // this line won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ✅ Display valid bogies
        System.out.println("\nFinal Train Bogies:");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        System.out.println("\nProgram continues safely...");
    }
}