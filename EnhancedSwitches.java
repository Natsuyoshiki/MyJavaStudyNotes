import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // Enhanced switch = A replacement to many else if statements  (Java 14 feature)

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){

            /*case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");         repetitive and too slow, it repeats itself, noob way
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
             */

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not a day");
        }



        scanner.close();
    }
}