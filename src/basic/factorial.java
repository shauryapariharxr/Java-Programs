import java.util.*;

public class factorial {
    public static void main(String[] args) {

        int n;
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
