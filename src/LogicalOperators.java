import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT

     /*   double temp = -20;
        boolean isSunney = false;

        if(temp <=30 && temp >= 0 && isSunney){
            System.out.println("The weather is good");
            System.out.println("it is sunny outside");
        } else if (temp <=30 && temp >= 0 && ! isSunney) {
            System.out.println("The weather is good");
            System.out.println("it is cloudy outside");

        }else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad");

        }

      */

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username;

        System.out.println("Enter your username: ");
        username = scanner.nextLine();

        if (username.length()<4 || username.length() >12){
            System.out.println("username must be between 4 to 12 characters");
        } else if (username.contains(" " )|| username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
            
        } else {
            System.out.println("Welcome "+username);
        }



        scanner.close();


    }
}
