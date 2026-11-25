public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("=== EXAMPLE 1: Division by Zero ===");
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error caught: You cannot divide by zero!");
            System.out.println("Java says: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (cleaning up resources).");
            System.out.println("Program continues safely...\n");
        }

        System.out.println("=== EXAMPLE 2: Array Out of Bounds ===");
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: The array index is out of bounds!");
        }
        System.out.println("Program continues safely...\n");

        System.out.println("=== EXAMPLE 3: Method with Exception Propagation ===");
        performRiskyOperation();
        System.out.println("Program finished.");
    }

    public static void performRiskyOperation() {
        try {
            String text = "abc";
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error caught: Invalid number format.");
        }
    }
}
