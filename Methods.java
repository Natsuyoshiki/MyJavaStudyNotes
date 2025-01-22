
public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

         String name = "Natsu";
         int age = 23;
         int age2 = 21;
         String fullName = getFullName("Spongebob", "squarepants");

         if(ageCheck(age2)){
             System.out.println("You may sign up!");
         }
         else
         {
             System.out.println("You must be 18+ to sign up");
         }

         
        System.out.println(fullName);
        System.out.println(square(3));
        System.out.println(cube(3));

        happyBirthday(name, age);      // call the method, Main can't read his neighbors variables (happyBirthday) unless we send the information (variable of main to the method)

    }

    static double square(double number) {
        return number * number;
    }
    static void happyBirthday(String yo, int age) {          //we have to enter the parameters the variable is a string called name, name of the args can be different
        System.out.printf("Happy Birthday to you! %s\n", yo);
        System.out.printf("You are %d years old\n", age);
    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age2){
        return age2 >= 18;        //simplified if(age >= 18){ return true;} else { return false;}
    }
}
