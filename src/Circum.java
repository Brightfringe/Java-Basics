import java.util.Scanner;
public class Circum {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * (Math.PI) * radius;

        area = Math.PI * (Math.pow(radius,2));

        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is %.1fcm", circumference);
        System.out.printf("\nThe area is %.1fcm^2", area );
        System.out.printf("\nthe volume is %.1fcm^3", volume);


        scanner.close();
    }
}
