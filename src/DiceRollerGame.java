import java.util.Scanner;
import java.util.Random;
public class DiceRollerGame {
    public static void main(String[] args) {
        // java dice roller program

        //declare variables
        //get no. of dice from the user
        //check if no. of dice > 0
        //roll all the dice
        //get the total
        //display ascii of dice

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("enter the no. of dice to roll: ");
        numOfDice = scanner.nextInt();
        if (numOfDice>0){
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("you rolled "+ roll);
                total += roll;
            }
            System.out.println("Total: "+total);
            
        }else {
            System.out.println("no. of dice must be greater then zero");
        }


        scanner.close();
    }
    static void printdie(int roll){

        String dice1 = """
                  -----
                |       |
                |   ●   |
                |       |
                  -----
                
        
                """;
        String dice2 = """
                  -----
                | ●     |
                |       |
                |     ● |
                  -----
                """;

        String dice3 = """
                   -----
                | ●     |
                |   ●   |
                |     ● |
                  -----
                """;

        String dice4 = """
                  -----
                | ●    ●|
                |       |
                | ●    ●|
                  -----
                """;
        String dice5 = """
                  -----
                | ●    ●|
                |   ●   |
                | ●    ●|  
                  -----
                """;
        String dice6 = """
                  -------
                | ●  ●  ● |
                | ●  ●  ● |
                | ●  ●  ● |
                  -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }


    }
}
