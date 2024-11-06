import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner keyboard = new Scanner(System.in);
         int Year;
        System.out.print("give a year:");
        Year= keyboard.nextInt();
        if (Year%400 == 4){
            System.out.println("this is a leap year");
        
        }
        if (Year%400 < 4 ){
            System.out.println("this is not a leap year");
        }
        if (Year%400 > 4 ){
            System.out.println("this is not a leap year");
        }
    } 
}
