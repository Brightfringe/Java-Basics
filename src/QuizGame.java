import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Arrays;
public class QuizGame {
    public static void main(String[] args) {
        // java quiz

        //questions array[]
        //options array[][]
        //declare variables
        //welcome message
        //question (loop)
        //options
        //get guess from user
        //check our guess
        //display final score
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("WELCOME TO THE QUIZ!!");
        System.out.println("**********************");

        String[] questions ={"1) Which of the three banks will be merged with the other two to create India’s third-largest bank?",
                                "2) What is the name of the weak zone of the earth’s crust?",
                                "3) Where was India’s first national Museum opened?",
                                "4) In 2019, Which popular singer was awarded the Bharat Ratna award?",
                                "5) The world’s nation 5G mobile network was launched by which country?"};

        String[][] options = {{"1.Punjab National Bank" , "2. Indian Bank" , "3. Bank of Baroda " , "4.Dena Bank"},
                {"1.Seismic " , "2.Cosmic" , "3.Formic" , "4.Anaemic"},
                {"1.Delhi" , "2.Hyderabad" , "3.Rajasthan" , "4.Mumbai"},
                {"1.Lata Mangeshkar" , "2.Asha Bhosle" , "3.Bhupen Hazarika " , "4.Manna Dey "},
                {"1.Japan" , "2.Asia" , "3.South Korea" , "4.Malaysia"}};

        int [] answers = {2,1,4,3,3};
        int score = 0;
        int guess;


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter the correct answer (1-4): ");
             guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("****************");
                System.out.println("Correct answer!");
                System.out.println("****************");
                score++;
            } else {
                System.out.println("*************");
                System.out.println("Wrong answer!");
                System.out.println("Correct answer: " + answers[i]);
                System.out.println("*************");
            }

            System.out.println();
        }

        System.out.println("Your total score: " + score + "/" + questions.length);
        scanner.close();
    }
}



