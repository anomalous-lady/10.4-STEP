import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample Inputs (can be replaced with Scanner later)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output
        if (isTrainValid) {
            System.out.println("Train ID is Valid: " + trainId);
        } else {
            System.out.println("Train ID is Invalid: " + trainId);
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is Valid: " + cargoCode);
        } else {
            System.out.println("Cargo Code is Invalid: " + cargoCode);
        }
    }
}