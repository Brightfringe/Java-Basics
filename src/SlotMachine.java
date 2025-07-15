import java.util.*;

public class SlotMachine extends Thread {
    public void run() {
        System.out.print("SPINNING");
        for (int i = 0; i <= 3; i++) {
            try {
                System.out.print("•");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

        }
    }

    public static void main(String[] args) {
        //Java slot machine

        //Declare variables
        //display welcome message
        //play if balance > 0
        //enter bet amount
        //       verify if bet > balance
        //       verify bet from balance
        //spin row
        //print row
        //get payout
        //ask to play again
        //display exit message

        String choose = " ";
        int balance = -1;
        int bet = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("Welcome to the java slots java !!😊");
        System.out.println("***********************************");
        System.out.println("※RULE BOOK※\n1.Two or more emoticons should be consequtively same to win\n2.If you win, you get doubled amount of your given bet\n3.If you loose,you'll loose the the given bet amount");
        System.out.println("***********************************");
        System.out.println("***********************************");


        do {
            boolean a = false;
            while (!a) {
                try {
                    System.out.print("Enter your current balance: ");
                    balance = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid format!\nEnter a number amount! ");
                    scanner.nextLine();
                    break;
                }
                break;
            }

            if (balance <= 0) {
                System.out.println("your balance cannot be negative or zero!!");
            }
        } while (balance <= 0);

        do {
            boolean b = false;
            while (!b) {
                try {

                    System.out.print("Enter the bet: ");
                    bet = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input\nEnter a valid bet amount!!");
                    scanner.nextLine();
                    break;
                }
                break;
            }

            if (bet > balance) {
                System.out.println("Bet amount is greater than your balance!!");
            } else if (bet <= 0) {
                System.out.println("Bet cannot be zero or negative!!");
            }
        } while (bet > balance || bet <= 0);


        do {

            System.out.println("***********************************");

            String[] fruits1 = {"🍉", "🍍", "🍈"};
            String[] fruitsRange1 = Arrays.copyOfRange(fruits1, 0, 3);

            Random random = new Random();
            int spin1 = random.nextInt(fruitsRange1.length);
            int spin2 = random.nextInt(fruitsRange1.length);
            int spin3 = random.nextInt(fruitsRange1.length);


            String spins1 = fruitsRange1[spin1];
            String spins2 = fruitsRange1[spin2];
            String spins3 = fruitsRange1[spin3];

            SlotMachine runnable = new SlotMachine();
            runnable.start();


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Your code has been interruped!");
            }
            System.out.println("\n" + spins1 + " | " + spins2 + " | " + spins3 + " | ");
            System.out.println("***********************************");


            if (spins1.equals(spins2) || spins2.equals(spins3)) {
                System.out.println("YOU WON!!");
                balance += (bet * 2);
            } else {
                System.out.println("YOU LOOSE!!");
                balance -= bet;
            }
            System.out.println("***********************************");
                    System.out.println("Do you want to play again?(Y/N)");
                    choose = scanner.nextLine().toUpperCase();
                    if (choose.equals("Y")) {
                        boolean b = false;
                        while (!b) {
                            try {
                                System.out.print("Enter the bet: ");
                                bet = scanner.nextInt();
                                scanner.nextLine();

                                if (bet > balance) {
                                    System.out.println("Bet amount is greater than your balance!!");
                                    //  System.out.println("DO you want to exit?(press N)");
                                    // choose = scanner.nextLine();

                                } else if (bet <= 0) {
                                    System.out.println("Bet cannot be zero or negative!!");
                                } else {
                                    b = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input\nEnter a valid bet amount!");
                                scanner.nextLine();
                            }

                        }

                    }

        }while (!choose.equals("N"));
        System.out.println("Goodbyee!!🤗");
        System.out.println("Your total amount is " + balance);

        scanner.close();
    }
}



