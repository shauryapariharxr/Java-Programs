import java.util.*;

public class leap_year{ 

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int y;


    y = scanner.nextInt();

    if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
    System.out.print("Leap Year");

    }
    else{

    System.out.println("Not a Leap Year");
  }

    }
}



