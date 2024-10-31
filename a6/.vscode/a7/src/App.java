public class App {
    public static void main(String[] args) throws Exception {
    }
}
public class Assignment7 { 

    public static void main(String[] args) { 
    }



        String message1 = "I am very happy!"; 

        String target1 = "very "; 

          

        int start = message1.indexOf(target1); 

         

        if (start != -1) { 

            String newMessage1 = message1.substring(0, start) + message1.substring(start + target1.length()); 

            System.out.println(newMessage1); 

        } 
        String message2 = "That was great - 1o1."; 

        String target2 = "1o1";

        int start2 = message2.indexOf(target2); 

        if (start2 != -1) { 

             

            String newMessage2 = message2.substring(0, start2) + "laugh out loud" + message2.substring(start2 + target2.length()); 

            System.out.println(newMessage2); 

        } 

    } 

} 