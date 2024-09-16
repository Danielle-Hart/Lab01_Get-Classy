import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class SafeInputObjTest {
    private SafeInputObj safeInput;

    @BeforeEach
    void setUp() {
        //different inputs for different tests
        Scanner scanner = new Scanner("Hello\n25\n100\n150.50\n200.75\nY\n12345");
        safeInput = new SafeInputObj(scanner);
    }

    @Test
    void getNonZeroLenString() {
        String name = safeInput.getNonZeroLenString("Enter your name");
        assertEquals("Hello", name);
    }

    @Test
    void getRangedInt() {
        int age = safeInput.getRangedInt("Enter your age", 0, 120);
        assertEquals(25, age);
    }

    @Test
    void getInt() {
        int number = safeInput.getInt("Enter any number");
        assertEquals(25, number);
    }

    @Test
    void getRangedDouble() {
        double price = safeInput.getRangedDouble("Enter a price", 0, 1000);
        assertEquals(25.0, price);
    }

    @Test
    void getDouble() {
        double measurement = safeInput.getDouble("Enter a measurement");
        assertEquals(25.0, measurement);
    }

    @Test
    void getYNConfirm() {
        boolean confirm = safeInput.getYNConfirm("Do you want to continue?");
        assertTrue(confirm);
    }

    @Test
    void getRegExString() {
        String zipCode = safeInput.getRegExString("Enter a 5-digit Zip Code", "^\\d{5}$");
        assertEquals("12345", zipCode);
    }
}
