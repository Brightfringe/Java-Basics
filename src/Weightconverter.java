import java.util.Scanner;
public class Weightconverter {
    public static void main(String[] args) {

        //weight conversion program
        //Declare variables
        //welcome msg
        //promp for user input
        //option 1 convert lbs to kgs
        //option 2 covert kgs to lbs
        // else print not a valid choice

        Scanner scanner = new Scanner(System.in);

        double wk;
        double wl;
        int option1 ;
        int option2 ;
        double a;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s Welcome.",name);

        System.out.println("Choose from the given options:~ ");
        System.out.print("Option1: I want to convert from lbs to kgs. (Choose: 1)");
        System.out.print("\nOption2: I want to convert from kgs to lbs. (Chosse: 2)");
        System.out.print("\nChoose an option: ");
        option2 = scanner.nextInt();

        if (option2 == 1){
            System.out.println("Conversion from lbs to kgs. ");
            System.out.print("Enter the value in lb:~ ");
            wl = scanner.nextDouble();
            a = wl * 0.4536;
            System.out.printf("The value in kgs is %.2fkg ",a);
        }
        else if (option2 == 2){
            System.out.println("Conversion from kgs to lbs. ");
            System.out.print("Enter the value in kgs:~");

            wk = scanner.nextDouble();
            double b = wk/0.4538;
            System.out.printf("The value in lbs is %.2flb",b);

        }




        scanner.close();



    }
}
