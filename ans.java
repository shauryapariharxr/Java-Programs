import java.util.*;

public class ans{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a;

        a = scanner.nextInt();
        System.err.println("Enter your year");


        if ((a%400==0) || (a%4==0 && a%100 != 00)) {

            System.err.println("Leap year");
            
            
        }else{

            System.err.println("Not a leap year ");
        }
    }
}