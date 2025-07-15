import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        //Compound Interest calculator

        Scanner scanner = new Scanner(System.in);

        double principalAmount;
        double interestRate;
        int compounded;
        int years;
        double amountAfter;

        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded this year: ");
        compounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amountAfter = principalAmount * Math.pow(1 + (interestRate/compounded),compounded*years);

        System.out.printf("The amount after %d years is $%.2f",years,amountAfter );



        scanner.close();


    }
}
