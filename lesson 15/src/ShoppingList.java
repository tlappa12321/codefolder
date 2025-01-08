import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        // Using a fixed-size array
        String[] shoppingArray = new String[5];
        shoppingArray[0] = "Milk";
        shoppingArray[1] = "Eggs";
        shoppingArray[2] = "Bread";
        shoppingArray[3] = "Cheese";
        shoppingArray[4] = "Butter";

        System.out.println("Original array: " + Arrays.toString(shoppingArray));

        //Adding a sixth item requires creating a new, larger array
        String[] newArray = new String[6]; //Increased size by 1
        System.arraycopy(shoppingArray, 0, newArray, 0, shoppingArray.length);
        newArray[5] = "Yogurt";
        shoppingArray = newArray; //Update reference to the new array
        System.out.println("Array after adding one item: " + Arrays.toString(shoppingArray));


        //Doubling the array size (a common strategy to reduce resizing)
        String[] doubledArray = new String[shoppingArray.length * 2];
        System.arraycopy(shoppingArray, 0, doubledArray, 0, shoppingArray.length);
        doubledArray[6] = "Apples";
        doubledArray[7] = "Bananas";
        shoppingArray = doubledArray;
        System.out.println("Doubled array: " + Arrays.toString(shoppingArray));


        // Using ArrayList
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Butter");
        System.out.println("\nOriginal ArrayList: " + shoppingList);

        shoppingList.add("Yogurt");
        System.out.println("ArrayList after adding one item: " + shoppingList);

        shoppingList.add("Apples");
        shoppingList.add("Bananas");
        System.out.println("ArrayList after adding more items: " + shoppingList);

    }
}