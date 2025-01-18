import java.util.Scanner;

public class MathClass{
   public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      //System.out.println(Math.PI);  3.14
      //System.out.println(Math.E);

      double result;

      result = Math.pow(2, 3); //power
      result = Math.abs(-5); //absolute
      result = Math.sqrt(9); //square route
      result = Math.round(3.14); //round numbers
      result = Math.ceil(3.20); //round up (4)
      result = Math.floor(3.99); //round down (3)
      result = Math.max(10,20); //max between two values (20)
      result = Math.min(10,20); //min

      System.out.println(result);


      //HYPOTENUSE c = Math.sqrt(a² + b²)

      double a;
      double b;
      double c;

      System.out.print("Enter the length of side A: ");
      a = scanner.nextDouble();

      System.out.print("Enter the length of side B: ");
      b = scanner.nextDouble();

      c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

      System.out.println("The Hypotenuse (side c) is: " + c);

      //circumference = 2 * Math.PI * radius;
      //area = Math.PI * Math.pow(radius; 2);
      //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

      double radius;
      double circumference;
      double area;
      double volume;

      System.out.print("Enter the radius: ");
      radius = scanner.nextDouble();

      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius,2);
      volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);


      System.out.println("The circumference is: " + circumference + "cm");
      System.out.println("The area is: " + area + "cm²");
      System.out.println("The volume is: " + volume);





scanner.close();
   }
}
