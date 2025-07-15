import java.util.Scanner;
public class Whileloops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     /*   String name = "";

        while (name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+ name);

      */
        String response = "";

        while (!response.equals("Q")){
            System.out.println("You are playing a game.");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        int age = 0;

        do{
            System.out.println("your age can't be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);
        System.out.println("You are " + age + " years old");

        scanner.close();

    }
}
