import java.util.*;

public class triangle {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num: ");
        n = scanner.nextInt();



        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


