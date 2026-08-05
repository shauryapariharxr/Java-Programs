
import java.util.Scanner;



public class area_of_rec{
    public static void main(String[] args) {


        double height  = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your width: ");
        width = scanner.nextDouble();

        System.out.print("Enter your height: ");
        height = scanner.nextDouble();

        area = height*width;
        System.out.print("Your area of rectangle is: " + area + " cm2");

        scanner.close();

               
    }
} 