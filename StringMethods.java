

public class StringMethods {
   public static void main(String[] args){

      String name = "Natsuyoshi";

      int length = name.length();  //length of name
      char letter = name.charAt(0);  //position of 0 is which car (position 0 (N))
      int index = name.indexOf("o"); //letter o is at position 6 (position of o)
      int lastIndex = name.lastIndexOf("s"); //position of the last "s" in the string

      // name = name.toUpperCase(); Make name in uppercase Natsuyoshi = NATSUYOSHI
      // name = name.toLowerCase(); lower case
      // name = name.trim(); eliminate the spaces
      // name = name.replace("o", "a"); replace "o" in the name with "a" instead Natsuyoshi = Natsuyashi


      System.out.println(name);
      System.out.println(length);
      System.out.println(letter);
      System.out.println(index);
      System.out.println(lastIndex);
      System.out.println(name.isEmpty());  // boolean name is not empty so it's false but if it was it would return true

     /* if(name.isEmpty()){
         System.out.println("Your name is empty");
      }
      else{
         System.out.println("Hello " + name);
      }


      if (name.contains(" ")) {
         System.out.println("Your name contains a space");                  if name contains "x" then ...
      }
      else{
         System.out.println("Your name DOESN'T contain any spaces");
      }
*/

      String password = "password";

      if (password.equals("password")) {
         System.out.println("Your name can't be password");             //if String equal "x" then...処理
      }
      else{
         System.out.println("Hello " + name);
      }

      String password1 = "Password1";

      if (password1.equalsIgnoreCase("password1")){   //ignore caps
         System.out.println("Your name can't be password1");
      }
      else{
         System.out.println("Hello " + name);
      }

   }
}