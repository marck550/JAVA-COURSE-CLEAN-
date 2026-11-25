// Corrected versions of the infinite loop bugs.
public class FixedLoops {
    public static void main(String[] args) {
        System.out.println("=== FIXED BUG 1 ===");
        int x = 1;
        while (x <= 5) {
            System.out.println("x = " + x);
            x++;
        }

        System.out.println("\n=== FIXED BUG 2 ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("\n=== FIXED BUG 3 ===");
        int y = 10;
        while (y > 0) {
            System.out.println("y = " + y);
            y--;
        }

        System.out.println("\nAll loops terminated successfully!");
    }
}
