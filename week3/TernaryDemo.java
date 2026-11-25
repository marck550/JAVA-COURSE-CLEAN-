// Demonstrates the ternary operator as shorthand for if-else.
public class TernaryDemo {
    public static void main(String[] args) {
        int age = 20;

        String eligibilityIfElse;
        if (age >= 18) {
            eligibilityIfElse = "Eligible to vote";
        } else {
            eligibilityIfElse = "Not eligible to vote";
        }
        System.out.println("Using if-else: " + eligibilityIfElse);

        String eligibilityTernary = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Using ternary: " + eligibilityTernary);

        int number = 7;
        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + evenOdd);
    }
}
