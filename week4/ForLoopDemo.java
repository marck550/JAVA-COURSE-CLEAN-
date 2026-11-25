// Demonstrates for loops and enhanced for loops.
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("=== EXAMPLE 1: Numbers 1 to 5 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("\n=== EXAMPLE 2: Sum of 1 to 100 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 100 = " + sum);

        System.out.println("\n=== EXAMPLE 3: Countdown ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast off!");

        System.out.println("\n=== EXAMPLE 4: Even Numbers 2 to 20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== EXAMPLE 5: Multiplication Table for 7 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        System.out.println("\n=== EXAMPLE 6: Enhanced for Loop ===");
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        for (String student : students) {
            System.out.println("Student: " + student);
        }
    }
}
