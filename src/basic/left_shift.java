
import java.util.Scanner;


public class left_shift{
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        System.err.println("enter your no");
        n = scanner.nextInt();



    

        if(n<=31){
            for(int i=0; i<=n; i++){
            System.err.println(1<<i);}
        }
        
        else{ 
            System.out.println("You have reached the max range of int");
        }


        
        }
    }




