import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //We'll perform a "Linear search" use a for loop to look through numbers

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};

        int target = 2;
        String target2;

        boolean isFound = false;
        boolean isFound2 = false;

        for (int i = 0; i < numbers.length; i++)
        {
            if(target == numbers[i])
            {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound)
        {
            System.out.println("Element not found in the array");
        }

        System.out.print("Enter a fruit to search for: ");
        target2 = scanner.nextLine();

        for (int j = 0; j < fruits.length; j++)
        {
            if (fruits[j].equals(target2))   //if it's a String then this is the formula to find it .equals
            {
                System.out.println("Element found at index: " + j);
                isFound2 = true;
                break;

            }
        }

        if (!isFound2)
        {
            System.out.println("Element not found in the array");
        }



        scanner.close();
    }
}