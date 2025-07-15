import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        //HYPOTENUSE C = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Enter the value of a:  " );
         a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
         b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The value of the hypotenuse is "+ c +"cm");


        scanner.close();
    }

}
