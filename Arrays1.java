import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //         variable that can store more than 1 value

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "pineapple";  //changed index 0 (apple) to pineapple
        int numOfFruits = fruits.length;   //length of array (4 elements)

        Arrays.sort(fruits);  //Sort arrays alphabetically -> apple, banana, coconut, orange
        //Arrays.fill(fruits, "pineapple");   fill the arrays with pineapple instead

       /* for(int i = 0; i < fruits.length; i++)
        {
            System.out.print(fruits[i] + " ");   //show all components of array in a single line with space
        }
        */

        for (String fruit : fruits)     //enhanced for loop (cycle once for each element of array)   fruit = unique identifier for each element of this array
        {
            System.out.println(fruit);
        }

        //System.out.println(fruits[0]);
        System.out.println(numOfFruits);
    }
}