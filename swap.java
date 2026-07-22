
import java.util.Scanner;


public class swap{
    public static void main(String[] args) {

        
        
        Scanner scanner = new Scanner(System.in);

        int a; 
        int b; 
        int c = 0;



        System.out.print("Enter you first number :");
        a = scanner.nextInt();

        System.out.print("Enter your second number :");
        b = scanner.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("your swap no are " + a + "," + b );









    }
}