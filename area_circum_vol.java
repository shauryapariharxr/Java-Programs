
import java.util.Scanner;


public class area_circum_vol{
    public static void main(String[] args) {
        
        double area;
        double volume;
        double circum;
        int num;
        double radius;
        double length;
        double breath;
        double width;
        double side;

        Scanner scanner = new Scanner(System.in);

        System.err.println("=======CHOOSE YOUR CHOISE=======");
        System.err.println("1. Circle ");
        System.err.println("2. Square ");
        System.err.println("3. Rectangle ");
        System.err.print("Enter your choice: ");
        num = scanner.nextInt();

        switch (num) {




            case 1:{


                System.err.print("Enter your Radius: ");
                radius = scanner.nextDouble();

                circum = 2 * Math.PI * radius;
                area = Math.PI * Math.pow(radius, 2);
                volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

                System.out.println("Your circumference of circle is: " + circum);
                System.out.println("Your area of circle is: " + area);
                System.out.println("Your volume of circle is: " + volume);

            }

            break;


            case 2:{

                System.err.print("Enter your Side : ");
                side = scanner.nextDouble();

                circum = 4 * side;
                area = Math.pow(side, 2);
                volume = Math.pow(side, 3);

                System.out.println("Your circumference of square is: " + circum);
                System.out.println("Your area of square is: " + area);
                System.out.println("Your volume of square is: " + volume);



            }

            break;


            case 3:{

                System.err.print("Enter your length: ");
                length = scanner.nextDouble();

                System.err.print("Enter your breath: ");
                breath = scanner.nextDouble();

                System.err.print("Enter your Width: ");
                width = scanner.nextDouble();

                circum = 2 * (length + breath);
                area = length * breath;
                volume = length * width * breath;

                System.out.println("Your circumference of rectangle is: " + circum);
                System.out.println("Your area of rectangle is: " + area);
                System.out.println("Your volume of retangle is: " + volume);

            }

            break;
                
            
            default:
                throw new AssertionError();
        }


    

    }
}