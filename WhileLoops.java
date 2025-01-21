import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

        // while loop = repeat some code forever
        //              while some condition remain true

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do                  // do makes you do the code first then check the condition (while)
        {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }
        while (number < 1 || number > 10);

        System.out.printf("You picked %d", number);
        



        /*int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0)
        {
            System.out.printf("Your age can't be negative\n");
            System.out.println("Enter your name: ");
            age = scanner.nextInt();
        }

        System.out.printf("You are %d years \n", age);
         */



        /*                  EXEMPLE 1
        String response = "";

        while(!response.equals("Q"))
        {
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");
         */

        /* Exemple 2
        String name = "";

        while(name.isEmpty())
        {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
         */

        scanner.close();
    }
}