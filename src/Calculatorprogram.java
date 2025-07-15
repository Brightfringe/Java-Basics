import java.util.Scanner;
public class Calculatorprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE CALCULATOR PROGRAM!");

        System.out.print("enter the first number: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("choose 1 for multiplication/2 for division/ 3 for addition/ 4 for subtraction/ 5 for power");
        int c = scanner.nextInt();

        switch (c){
            case 1 -> System.out.println("MULTIPLICATION: "+ a*b);
            case 2 -> System.out.println("division: "+ a/b);
            case 3 -> System.out.println("Addition: "+ (a+b));
            case 4 -> System.out.println("Subtraction : "+ Math.subtractExact(a,b));
            case 5 -> System.out.println("Exponential: "+ Math.pow(a,b));
            default -> System.out.println("not a valid option!");
        }


        scanner.close();

    }
}
