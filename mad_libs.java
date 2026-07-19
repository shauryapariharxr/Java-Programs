
import java.util.Scanner;


public class mad_libs{
    public static void main(String[] args) {
    
    // MAD LIBS GAME 

    Scanner scanner = new Scanner(System.in);

    String adjective1;
    String noun1;
    String adjective2;
    String verbs1;
    String adjective3;

    System.out.print("Enter a adjestive (Description): ");
    adjective1 = scanner.nextLine();   
    System.out.print("Enter a noun (animal or person): ");
    noun1 = scanner.nextLine();
    System.out.print("Enter an adjective (Descrition): ");
    adjective2 = scanner.nextLine();
    System.out.print("Enter an verb end with -ing  (action): ");
    verbs1 = scanner.nextLine();
    System.out.print("Enter an adjective (Descrition): ");
    adjective3 = scanner.nextLine();


    System.out.println("Today I went to a " + adjective1 + "zoo. ");
    System.out.println("In a exhibit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verbs1 + "!");
    System.out.println("I was " + adjective3 + "!");


    scanner.close();

    }
}