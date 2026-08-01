
import java.util.Scanner;


public class function{

    public static void main(String[] args) {

        int a;
        int b; 
        int c;
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter your num: ");
        a = scanner.nextInt();

        System.err.print("Enter your num: ");
        b = scanner.nextInt();
        
        System.err.print("Enter your num: ");
        c = scanner.nextInt();


        System.err.println(add(a, b));
        System.err.println(sub(a, b));
        System.err.println(div(a, b));

        add3(a, b, c);



    }
        public static int add(int a ,int b){
            return a+b;
        }

        public static float sub(float  a ,float  b){
            return a-b;
        }

        public static double div(double  a ,double  b){
            if(b==0){
                System.err.println("Num can not be divisble by 0");
            }
            return a/b;
            
        }

        public static void add3(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }
}





    


