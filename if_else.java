
import java.util.Scanner;


public class if_else{
    public static void main(String[] args) {

         
        int age;
        String name;
        boolean isStudent;



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (True/False): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1 
        if(name.isEmpty()){
            System.out.println("You did'nt enter your name! ");
        }else{
            System.out.println("hello " + name + "!");
        }

        //GROUP 2 
        if(age >= 18){

            System.out.println("You are an adult");

        }else if (age < 0){
            System.out.println("You haven't born yet ");
        
        }else if (age >= 65){

            System.out.println("You are an senior ");


        }else if (age == 0){
            System.out.println("You are a baby ");
        }

        else{
            System.out.println("You are a child ");
        }

        //GROUP 3 

        if(isStudent){
            System.out.println("You are a Student! ");
        }else{
            System.out.println("You are not a Student ");

            scanner.close();


        }




    



        
    



    }


        
}