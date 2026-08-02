
import java.util.Scanner;


public class compound_interest{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double principle;
    double rate;
    int timescompound;
    int year = 0;
    double amount;

    System.out.print("Enter your principle amount: ");
    principle = scanner.nextDouble();

    System.out.print("Enter your interest rate (in %): ");
    rate = scanner.nextDouble() / 100.0;

   System.out.print("Enter the # of times compound per year: ");
   timescompound = scanner.nextInt();

   System.out.print("Enter the # of years: ");
   year = scanner.nextInt();


   amount = principle * Math.pow(1 + rate / timescompound, timescompound * year);

   System.out.println("The amount after " + year + "is: $" + amount );
  }
}
