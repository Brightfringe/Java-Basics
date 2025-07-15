import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Random;
public class Numberguessinggame {
    public static void main(String[] args) {

        //Number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomnumber = random.nextInt(1,101);

        System.out.println("NUMBER GUESSING GAME ~");
        System.out.println("Guess a number between 1-100: ");

        do {

            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if ( guess < randomnumber){
                System.out.println("TOO LOW! TRY AGAIN");
            } else if (guess > randomnumber) {
                System.out.println("TOO high! try again");

            }else {
                System.out.println("CORRECT! THE NUMBER WAS " + randomnumber);
                System.out.println("# of attemps: "+attempts);
            }

        }
        while (guess != randomnumber);

        System.out.println("You have won");

        scanner.close();


    }
}
