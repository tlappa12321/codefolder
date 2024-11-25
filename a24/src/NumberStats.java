// Loop a24
// Theo 
//
import java.util.Scanner;

public class NumberStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the stop number: ");
        int stop = scanner.nextInt();

        
        int total = 0;
        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = start; i <= stop; i++) {
            total += i; 

            if (i % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        
        System.out.println("Total sum of numbers: " + total);
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

        
        scanner.close();
    }
}