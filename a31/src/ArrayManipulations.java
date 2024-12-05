import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {
        int[] array1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int[] array2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
        
        
        int sum = sumArraySection(array1, 2, 5);
        System.out.println("Sum of array1 from index 2 to 5: " + sum);

        
        int count = countOccurrences(array1, 7);
        System.out.println("Occurrences of 7 in array1: " + count);

        
        int[] newArray1 = removeValue(array1, 7);
        System.out.println("array1 after removing 7: " + Arrays.toString(newArray1));

        
        System.out.println("\nOperations on array2:");
        
        
        sum = sumArraySection(array2, 0, 7);
        System.out.println("Sum of array2 from index 0 to 7: " + sum);

       
        count = countOccurrences(array2, 7);
        System.out.println("Occurrences of 7 in array2: " + count);

        
        int[] newArray2 = removeValue(array2, 7);
        System.out.println("array2 after removing 7: " + Arrays.toString(newArray2));
    }

    
     
    public static int sumArraySection(int[] array, int startIndex, int endIndex) {
        int sum = 0;
        
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            System.out.println("Invalid indices.");
            return 0;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    
    
     
    public static int countOccurrences(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

   
    public static int[] removeValue(int[] array, int value) {
        int count = countOccurrences(array, value);
        int[] newArray = new int[array.length - count];
        int index = 0;

        for (int num : array) {
            if (num != value) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
}
