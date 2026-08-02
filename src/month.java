import java.util.Scanner;

public class month{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m;
        int y=0;

        System.err.print("Enter your month: ");
        m = scanner.nextInt();

        System.err.print("Enter your year: ");
        y = scanner.nextInt();

        if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){

            System.err.println("31 Days");


        }else if (m==4 || m==6 || m==9 || m==11) {

            System.err.println("30 Days");

        }else if (m==2){

            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
    System.out.print("28 days");

    }
    else{

    System.out.println("29 days");
  }

        }
    }
}
