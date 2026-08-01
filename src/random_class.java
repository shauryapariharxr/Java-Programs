
import java.util.Random;


public class random_class{
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        int number1 ; 
        int number2 ; 
        double number3;
        boolean isHead;




        number = random.nextInt(1, 100);
        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 102);
        number3 = random.nextDouble();
        isHead = random.nextBoolean();


        if(isHead){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }



        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
       


        




    }
}