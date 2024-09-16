import java.util.Scanner;

public class SafeInputObjTest {
    public static void main(String[] args) {
        SafeInputObj safeInput = new SafeInputObj();

        // Test getNonZeroLenString
        String name = safeInput.getNonZeroLenString("Enter Your Name");
        System.out.println("Name Entered: " + name);

        // Test getRangedInt
        int age = safeInput.getRangedInt("Enter Your Age", 0, 120);
        System.out.println("Age Entered: " + age);

        // Test getInt
        int number = safeInput.getInt("Enter Any Integer");
        System.out.println("Integer Entered: " + number);

        // Test getRangedDouble
        double price = safeInput.getRangedDouble("Enter A Price", 0, 1000);
        System.out.println("Price Entered: " + price);

        // Test getDouble
        double measurement = safeInput.getDouble("Enter A Measurement");
        System.out.println("Measurement Entered: " + measurement);

        // Test getYNConfirm
        boolean confirm = safeInput.getYNConfirm("Do You Want To Continue?");
        System.out.println("Confirmation: " + (confirm ? "Yes" : "No"));

        // Test getRegExString
        String zipCode = safeInput.getRegExString("Enter A 5-Digit Zip Code", "^\\d{5}$");
        System.out.println("Zip Code Entered: " + zipCode);

        System.out.println("All Tests Completed!");
    }
}
