import java.util.Scanner;

public class CalculatorInterestPerYear {
   public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      //A = P[1+r/n]nt compounded interest formulas

      double principal;
      double rate;
      int timesCompounded;
      int years;
      double amount;

      System.out.print("Enter the principal amount: ");
      principal = scanner.nextDouble();

      System.out.print("Enter the interest rate(in %): ");
      rate = scanner.nextDouble() / 100;   //divide by 100 because we want the result to be ex : if 5 then 0.05

      System.out.print("Enter the # of times compounded per year: ");
      timesCompounded = scanner.nextInt();

      System.out.print("Enter the # of years: ");
      years = scanner.nextInt();

      amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

      // System.out.println("The amount after " + years + " is: $" + amount);
      System.out.printf("The amount after %d years is $%.2f", years, amount);



      scanner.close();
   }
}