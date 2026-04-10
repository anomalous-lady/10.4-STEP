import java.util.*;

// ✅ Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ✅ Goods Bogie Class
class GoodsBogie {
    private String type;   // Rectangular / Cylindrical
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // ✅ Cargo Assignment with try-catch-finally
    public void assignCargo(String cargoType) {
        try {
            // ❌ Unsafe condition
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie");
            }

            // ✅ Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType + " → " + type);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }
}

// ✅ Main App
public class app {

    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        GoodsBogie b3 = new GoodsBogie("Rectangular");

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment (will be handled)
        b2.assignCargo("Petroleum");

        // ✅ Another safe assignment
        b3.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}