import java.util.Scanner;

public class SubStrings {
   public static void main(String[] args){

      // .substring() = A method used to extract a portion of a string
      //                string.substring(start, end)

      Scanner scanner = new Scanner(System.in);

      //String email = "Natsu123@gmail.com";
     // String username = email.substring(0,8);       //takes only the first 8 letters of the string
     // String domain = email.substring(9,18);  //or just 9, don't to specify 18 since start point is 9 all the way to the end so (9)

      //String username = email.substring(0,email.indexOf("@"));  //use indexOf to to make it start or stop at @
      //String domain = email.substring(email.indexOf("@"));
      //String domain = email.substring(email.indexOf("@") + 1); // ("@") + 1  move by 1 to the right. @gmail.com = gmail.com

      String email;
      String username;
      String domain;

      System.out.print("Enter your email: ");

      email = scanner.nextLine();

      if(email.contains("@")){
         username = email.substring(0, email.indexOf("@"));
         domain = email.substring(email.indexOf("@") + 1);
         System.out.println(username);
         System.out.println(domain);
      }
      else {
         System.out.println("Emails must contain @");
      }





      scanner.close();
   }
}