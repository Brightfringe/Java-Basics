import java.util.Enumeration;
import java.util.Scanner;
public class Methods {
    /*
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()

        String name = "Bro";
        int age = 25;

        happybirthday(name , age);

    }

   static void happybirthday(String name , int age){
        System.out.println("Happy birthday to you");
        System.out.printf("Happy bithday dear %s\n" , name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy birthday you!\n ");

    }

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
       double result = square(number);
        System.out.println(result);
        System.out.println(cube(2));
        int age = 21;
        if (ageCheck(age)){
            System.out.println("you may sign up");
        }else{
            System.out.println("you must be 18 or above");
        }

    }

   static double square(double number){return number * number;}
    static double cube(double number){return number*number*number;}

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
