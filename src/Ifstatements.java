import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Ifstatements {
    public static void main(String[] args) {

        //if statements: perfors a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter the age: ");
        int age = scanner.nextInt();

        System.out.println("are you a student? ");
        boolean isStudent = scanner.nextBoolean();


        //grp1

        if(name.isEmpty()){
            System.out.println("you didnt enter the name!");
        }
        else{
            System.out.println("hello "+ name + "!");
        }

        //grp2
        if(age >= 65) {
            System.out.println("you are a senior");
        }
        else if (age >=18) {
            System.out.println("you are an adult");

        } else if(age < 0){
            System.out.println("you are not born yet ");
        } else if (age == 0) {
            System.out.println("you are a baby");

        } else{
            System.out.println("you are a child");
        }

        //grp3
        if (isStudent){
            System.out.println("you are student.");
        }
        else {
            System.out.println("you are not a student");
        }



        scanner.close();
    }
}
