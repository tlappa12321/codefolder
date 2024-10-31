import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
          Scanner keys = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        System.out.print("Enter a Sentence: ");
        String sentence = keys.nextLine();
        System.out.println(num + " " + sentence);

    }
}
