
public class Printf{
   public static void main(String[] args){

      //printf() = is a method used to format output
      //%[flags][width][.precision][specifier-character]  %f = double float  %d = int %s = string %c = char %b = boolean \n = nextLine

      String name = "Spongebob";
      char firstLetter = 'S';
      int age = 30;
      double height = 60.5;
      boolean isEmployed = true;

      System.out.printf("Hello %s\n", name);
      System.out.printf("Your name starts with a %c\n", firstLetter);
      System.out.printf("You are %d years old\n", age);
      System.out.printf("You are %f inches tall\n", height);
      System.out.printf("Employed: %b\n", isEmployed);

      System.out.printf("%s is %d years old\n", name, age);

      //.precision   %.1f = display 1 digit ; %.2f = 2 digits

      double price1 = 9.99;
      double price2 = 100.15;
      double price3 = -54.01;

      System.out.printf("%.1f\n", price1);
      System.out.printf("%f\n", price2);
      System.out.printf("%.2f\n", price3);

      //flags
      //+ = output a plus
      //, = comma grouping separator
      //( = negative numbers are enclosed in ()
      // space = display a minus if negative, space is positive

      double price4 = 14.99;
      double price5 = 20000.22;
      double price6 = -32.45;
      double price7 = 30;

      System.out.printf("%+.2f\n", price4);
      System.out.printf("%,.3f)\n,", price5);
      System.out.printf("%(.2f\n", price6);
      System.out.printf("% .2f\n", price7);

      //width
      // 0 = zero padding
      // number = right justified padding
      //negative number = left justified padding

      int id1 = 1;
      int id2 = 23;
      int id3 = 456;
      int id4 = 7890;

      System.out.printf("%04d\n", id1);  // %04d = 0001     %4d =     1 (spaces to align to the right)     %-4d = 1 (to the left)
      System.out.printf("%04d\n", id2);
      System.out.printf("%04d\n", id3);
      System.out.printf("%04d\n", id4);








   }
}
