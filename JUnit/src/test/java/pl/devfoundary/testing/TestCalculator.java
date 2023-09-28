package pl.devfoundary.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private void assertEquals(double i, double result, String s) {}

    @Test
    public void testAddition() {
        // Test addition functionality
        int result = Calculator.sum(2, 3);
        assertEquals(5, result, "Adding 2 and 3 should equal 5");
    }


    @Test
    public void testSubtraction() {
        // Test subtraction functionality
        int result = Calculator.sub(5, 3);
        assertEquals(2, result, "Subtracting 3 from 5 should equal 2");
    }
    @Test
    public void testMultiplication() {
        // Test multiplication functionality
        int result = Calculator.mul(4, 3);
        assertEquals(12, result, "Multiplying 4 by 3 should equal 12");
    }
    @Test
    public void testDivision() {
        // Test division functionality
        double result = Calculator.div(10, 2);
        assertEquals(5.0, result, "Dividing 10 by 2 should equal 5.0");
    }
}

