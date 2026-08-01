import java.util.*;

public class Input{
    public static void main(String[] args) {
        

        try(Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Are you a student:(True/False)? ");
            Boolean isStudent = scanner.nextBoolean();


            System.out.println("Hello, " + name);
            System.out.println("You are " + age + " years old");


            if(isStudent){
                System.out.println("You are Enrolled as student");
            }

            else{
                System.out.println("You are not Enrolled");
            }



        }
    }

}