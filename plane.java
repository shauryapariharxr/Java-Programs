import java.util.*;

public class plane{

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     int x = 0;
     int y = 0;
     System.err.print("Enter the x-coordinate: ");
     x = scanner.nextInt();
     System.err.print("Enter the y-coordinates: ");
     y = scanner.nextInt();

     if( x > 0 && y > 0 ){
        System.out.println("Quadrant 1");
     }
     else if( x < 0 && y > 0) {
        System.out.println("Quadrant 2");

     }
     else if( x < 0 && y < 0) {
        System.out.println("Quadrant 3");


     }
     else if( x > 0 && y < 0) {
        System.out.println("Quadrant 4");
     }

     else if( x == 0 || y == 0){
        System.out.println("On Axis");
     }
}
}








