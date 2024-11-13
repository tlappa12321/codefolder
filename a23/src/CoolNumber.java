public class CoolNumber {

    
    public static boolean isCoolNum(int n) {
        return (n % 3 == 1) && (n % 4 == 1) && (n % 5 == 1) && (n % 6 == 1);
    }

    
    public static int countCoolNumbers(int n) {
        int count = 0;
        for (int i = 6; i <= n; i++) {
            if (isCoolNum(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        int upperLimit = 30;
        System.out.println("Count of cool numbers between 6 and " + upperLimit + ": " + countCoolNumbers(upperLimit));

        
        int testNum = 13;
        System.out.println("Is " + testNum + " a cool number? " + isCoolNum(testNum));
    }
}