
import java.util.Scanner;


public class sub_string{
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      String email;
      String username;
      String domain;


      System.out.print("Enter you email: ");
      email = scanner.nextLine();

      username = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@"));


      System.out.println("Your email is: " + email);
      System.out.println("Your username is: " + username);
      System.out.println("Your domain is: " + domain);





  }
}
