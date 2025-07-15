import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        //HANGMAN JAVA GAME
        System.out.println("*************************************");
        System.out.println("WELCOME TO THE JAVA HANGMAN GAME!!😊");
        System.out.println("*************************************");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String filepath = "C:\\Users\\shubh\\IdeaProjects\\javabasics\\Names.txt";
        String[] words = {"PIZZA","COURT","SPELL","SOLID","DENSE"};

        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(Arrays.toString(words));
        } catch (IOException e) {
            System.out.println("Something wrong with your file!");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("unable to find your file");
        } catch (IOException e) {
            System.out.println("Something wrong with your file");
        }
    }
}
