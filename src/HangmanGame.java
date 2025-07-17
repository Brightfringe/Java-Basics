import java.io.*;
import java.util.*;

public class HangmanGame {
    public static void main(String[] args) {
        //HANGMAN JAVA GAME
        System.out.println("*************************************");
        System.out.println("WELCOME TO THE JAVA HANGMAN GAME!!😊");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("※RULE BOOK※\n1. The words are related to computer science and coding😺\n2. The words given below are there for YOU3e ,so that it will a little easier for you to guess 🤫 :- \n{COMPILER,ARRAY,RECURSION,SYNTAX,BOOLEAN,POINTER,CLASS}\n3.total lives are 6");


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        HangmanClass hangman = new HangmanClass();

        String guessing = hangman.getRandomWord();
        StringBuilder guessedWord = new StringBuilder("_".repeat(guessing.length()));
        Set<Character> guessChar = new HashSet<>();//hashset is used to avoid any repeating of any letter
        Set<Character> wrongChar = new HashSet<>();
        int lives = 6;

        while (lives > 0 && guessedWord.toString().contains("_")) {

            System.out.println("word to guess: " + guessedWord);
            System.out.print("Enter a letter: ");

            String input = scanner.next().toUpperCase();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input! please enter a valid alphabet(A-Z).");
                continue;
            }
             char guessLetter = input.charAt(0);

            if (guessChar.contains(guessLetter)) {
                System.out.println("You have already guessed the letter !");
                continue;
            }else if (wrongChar.contains(guessLetter)){
                System.out.println("You have guessed this letter already and it was wrong!");
                continue;
            }

            guessChar.add(guessLetter);

            if (guessing.contains(Character.toString(guessLetter))) {
                for (int i = 0; i < guessing.length(); i++) {
                    if (guessing.charAt(i) == guessLetter) {
                        guessedWord.setCharAt(i, guessLetter);
                    }
                }
                System.out.println("Correct answer!!");
            } else {
                wrongChar.add(guessLetter);
                lives--;
                System.out.println("Wrong answers! Total number of lives left: " + lives);
                if (lives == 5) {
                    System.out.println(""" 
                              Ó
                            | | | 
                             / 
                             
                             """);
                } else if (lives == 4) {
                    System.out.println("""
                                              Ó
                                            | | | 

                            """

                    );
                } else if (lives == 3) {
                    System.out.println("""
                                              Ó
                                            | | 

                            """

                    );
                }
                else if (lives == 2) {
                    System.out.println("""
                                              Ó
                                              |

                            """

                    );
                }
                else if (lives == 1) {
                    System.out.println("""
                                              Ó
                                                
                                                """
                    );
                }
            }


        }
        if (lives > 0) {
            System.out.println("HURREYY!! You Won!! 🥳 \nANSWER: " + guessing);
        } else {
            System.out.println("Game over ☠️!! You loose...\nThe correct answer was " + guessing);
            System.out.println("""
                                              Ø
                                                
                                                """
            );

        }
        scanner.close();
    }

}


