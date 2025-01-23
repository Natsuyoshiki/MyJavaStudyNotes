import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){

        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR THE COMPUTER
        // CHECK WIN CONDITIONS
        //ASK TO PLAY AGAIN?
        //GOODBYE MESSAGE

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors: ");
            playerChoice = scanner.nextLine().toLowerCase();


            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors"))
            {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice))
            {
                System.out.println("It's a tie!");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper"))
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose!");
            }

            System.out.println("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");





        scanner.close();
    }
}