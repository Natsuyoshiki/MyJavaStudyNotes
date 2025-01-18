import java.util.Random;

public class RandomNumber{
   public static void main(String[] args){

      Random random = new Random();

      int number1;
      int number2;
      int number3;
      double number4;
      boolean heads;

      number1 = random.nextInt(1,11);
      number2 = random.nextInt(10,16);
      number3 = random.nextInt(16,21);
      number4 = random.nextDouble(5.45,20.65);
      heads = random.nextBoolean();

      System.out.println(number1);
      System.out.println(number2);
      System.out.println(number3);
      System.out.println(number4);

      if(heads){
         System.out.println("Heads");
      }
      else{
         System.out.println("Tails");
      }



   }
}
