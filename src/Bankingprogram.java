import java.util.Scanner;
public class Bankingprogram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // java banking program

        // Declare variables
        //display menu
        //get and process users choice
        //showBlanced
        //deposit()
        //withdraw()
        //EXIT MESSAGE

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("*****************");
            System.out.println("Banking Program");
            System.out.println("*****************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************\n");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }
        System.out.println("*****************");
        System.out.println("Thankyou! Have a nice day!");
        System.out.println("*****************");
        scanner.close();

    }

    static void showBalance(double balance){
        System.out.println("*****************");
        System.out.printf("$%.2f\n" , balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to de deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative.");
        }else {
            return amount;

        }
        return 0;
    }
    static  double withdraw(double balance){
        double amount;
        System.out.print("Enter the amont to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insuffifiant funds");
            return 0;
        }else if (amount<0){
            System.out.println("Amount cant be negative");
            return 0;
        }else {
            return amount;
        }
    }
}



