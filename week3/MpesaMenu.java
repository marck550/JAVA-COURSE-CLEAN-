// Menu-driven program using a switch statement.
import java.util.Scanner;

public class MpesaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== M-PESA AGENT MENU ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Send Money");
        System.out.println("3. Withdraw Cash");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is KSh 10,000.00");
                break;
            case 2:
                System.out.println("Send Money selected.");
                break;
            case 3:
                System.out.println("Withdraw Cash selected.");
                break;
            case 4:
                System.out.println("Thank you for using M-Pesa. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}
