import java.util.Scanner;

public class right_shift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of positions to shift: ");
        int shift = sc.nextInt();

        int result = n >> shift;

        System.out.println("Original Number : " + n);
        System.out.println("After Right Shift: " + result);

        sc.close();
    }
}