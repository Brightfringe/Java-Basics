import java.util.Scanner;
public class TempratureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp1;

        System.out.print("Enter the temperature: ");
        temp1 = scanner.nextDouble();
        System.out.println("choose C for celcius conversion or F for fahrenheit. ");
        String option = scanner.next().toUpperCase();

       double   c = (option.equals("C")) ?  (temp1 - 32) * 5.0/9 : (temp1 * 9.0/5) + 32;

        System.out.println(c);

        scanner.close();




    }
}
