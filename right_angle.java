import java.util.*;

public class right_angle{
    public static void main(String[] args) {
        
    
    
    Double length;
    Double breath;
    Double result;


    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the Length of triangle: ");
    length = scanner.nextDouble();

    System.out.print("Enter the Length of triangle: ");
    breath = scanner.nextDouble();

    result = Math.sqrt(length*length + breath*breath);
    System.out.println("Your hypo lenght is: " + result);





}

}