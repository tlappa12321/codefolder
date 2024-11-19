
import java.util.Scanner;

public class NumberStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for start and stop numbers
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the stop number: ");
        int stop = scanner.nextInt();

        // Initialize variables
        int total = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Loop through the range from start to stop
        for (int i = start; i <= stop; i++) {
            total += i; // Add the current number to total

            if (i % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++; // Increment odd count
            }
        }

        // Output the results
        System.out.println("Total sum of numbers: " + total);
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

        // Close the scanner
        scanner.close();
    }
}