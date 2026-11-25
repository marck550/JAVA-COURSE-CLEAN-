import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        String fileName = "transactions.txt";

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("=== READING FILE: " + fileName + " ===");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
            System.out.println("=== FILE READING COMPLETE ===");
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
    }
}
