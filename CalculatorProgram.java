import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;        //Assign it to 0 cuz there is a possibility it's not initialized and return no value
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2= scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num1;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");              // added some lines to avoid infinity if divided by 0
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default ->{
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println(result);
        }

        
        scanner.close();
    }
}