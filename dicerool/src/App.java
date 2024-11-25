import java.util.Random;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int numRolls;
        int[] outcomes;
        int current;

        System.out.println("how many dice do you want to roll");
        numRolls = keys.nextInt();
        outcomes = int[numRolls];

        for (int roll =0; roll < numRolls; roll ++){

            current = rand.nextInt(6);
            outcomes[roll] = current;
        }
    }
}
