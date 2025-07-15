import java.util.Scanner;
public class Shu {
    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("what is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("your gpa is: "+gpa);

        if(isStudent) {
            System.out.println("you are enrolled.");
        }
            else{
                System.out.println("you are not enrolled");
            }

        scanner.close();
        }

    }

*/

//common issues
        Scanner scanner = new Scanner(System.in);


        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // using this to exclude that issue

        System.out.print("Enter your fav color: ");
        String color = scanner.nextLine();

        System.out.println("you are " + age + " years old");
        System.out.println("you like the color " + color);


        scanner.close();

    }
}
