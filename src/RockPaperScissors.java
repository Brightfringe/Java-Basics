import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //rock paper scissors

        //declare variables
        //get choice from the user
        //get random choice for the computer
        //check win conditions
        // ask to play again?
        //goodbye message

        String answer;

        do {
            int userChoice;
            int computerChoice;

            System.out.println("Welcome to the java game!!");
            System.out.println("Enter your choice(1:rock/2:paper/3:scissors): ");
            userChoice = scanner.nextInt();
            scanner.nextLine(); //have to understand why this line is added :- explaination is given down in the following:
            /*| Why it's needed | Because nextInt() leaves a newline (\n) |
         | What it fixes | Prevents nextLine() from reading empty input |
         | When to use it | Always after using nextInt(), nextDouble(), etc., before using nextLine() |
             */

            Random random = new Random();
            computerChoice = random.nextInt(1, 4);
            if (computerChoice == 1) {
                System.out.println("Computer's choice: rock");
            } else if (computerChoice == 2) {
                System.out.println("Computer's choice: paper");
            } else if (computerChoice == 3) {
                System.out.println("Computer's choice: scissors");
            }

            if (userChoice == computerChoice) {
                System.out.println("No winner! its a tie😥");
            } else if (userChoice == 1 && computerChoice == 3 || userChoice == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2) {
                System.out.println("YOU WON!😆😆");
            } else {
                System.out.println("YOU LOOSE!😢😭😟");
            }

            System.out.println("Do you want to play again??");
            answer = scanner.nextLine().toLowerCase();

        }while (!answer.equals("no"));

        System.out.println("Thanks for playing! Goodbye 👋😊");

        scanner.close();


    }

}



