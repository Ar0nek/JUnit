package pl.devfoundary.testing;

public class Calculator {
    public static int sum(int a, int b) {
       return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        else {
            return a / b;
        }
    }
}
