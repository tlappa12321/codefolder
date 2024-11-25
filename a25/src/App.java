import java.util.Random;



    public static void main(String[] args) throws Exception {
        // Create a Random object to generate random numbers
        Random rand = new Random();

        // Loop to repeat the process 10 times
        for (int i = 0; i < 10; i++) {
            // Generate two random integers (you can adjust the range as needed)
            int num1 = rand.nextInt(1000); // Random number between 0 and 999
            int num2 = rand.nextInt(1000); // Random number between 0 and 999

            // Display the generated numbers
            System.out.println("Here are two random numbers:");
            System.out.println(num1 + " and " + num2);
            System.out.println();

            // Determine the smallest and largest numbers
            int smallest = Math.min(num1, num2);
            int largest = Math.max(num1, num2);

            // Output the results
            System.out.println("the smallest is " + smallest);
            System.out.println("the biggest is " + largest);
            System.out.println();  // Add a newline for better readability
        }
    }
