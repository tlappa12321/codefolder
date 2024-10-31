import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();

 

      System.out.print("Enter an integer :: ");

      intTwo = keyboard.nextInt();

 

      System.out.println("integer one = " + intOne);

      System.out.println("integer two = " + intTwo);
    
      System.out.println("double one " + intOne * 2  ); 

      System.out.println("double two " + intTwo *2 );

      System.out.println( intOne + intTwo  );

      System.out.println( (intOne*2) + (intTwo*2) );
}
}
