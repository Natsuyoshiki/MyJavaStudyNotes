import java.util.Scanner;

public class TernaryOperator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //ternary operator ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse


        int hours = 13;
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        System.out.println(taxRate);



        /*int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";           //% makes the number divided evenly if it's even it should be 0 (even) if not then it's ODD

        System.out.println(evenOrOdd);

        /*
        Ternary:
        String passOrFail = (score>60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

         the if way
        int score = 55;
        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        System.out.println(score);
         */
scanner.close();
    }
}