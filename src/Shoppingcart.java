import java.util.Scanner;
public class Shoppingcart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        int q = scanner.nextInt();

        System.out.println("You bought "+q+" "+item+"/s");
        System.out.println("Your total is $"+ q*price);

        scanner.close();

    }
}
