// Program name: ReverseRaffle
// Theo 
// Date: January 7, 2025


import java.util.ArrayList;
import java.util.Random;

public class ReverseRaffle {

    public static void main(String[] args) throws InterruptedException {

    
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        names.add("Heidi");
        names.add("Ivan");
        names.add("Judy");
        names.add("Kevin");


        System.out.println("Welcome to the Reverse Raffle!");
        System.out.println("The last name drawn is the winner!");
        System.out.println("Let's begin!\n");

        Random random = new Random();

        while (names.size() > 1) {
            int index = random.nextInt(names.size());
            String removedName = names.remove(index);
            System.out.println("Removed: " + removedName);
            Thread.sleep(1000); 

        }

        System.out.println("\nThe winner is: " + names.get(0) + "!");
    }
}