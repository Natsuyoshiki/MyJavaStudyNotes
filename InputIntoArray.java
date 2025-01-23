import java.util.Scanner;

public class InputIntoArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String[] foods = new String[4];  before assigning values into an array compiler needs to know size of array, created empty array that got space for 3 elements
        String[] foods;
        int size;

        System.out.printf("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();   //Need to clear up if scanner use int then string

        foods = new String[size];

        //foods[0] = "pizza";    //assigning values into empty array
        //foods[1] = "taco";
        //foods[2] = "hamburger";

        for (int i = 0; i < foods.length;i++)
        {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods)
        {
            System.out.println(food);
        }


        scanner.close();
    }
}