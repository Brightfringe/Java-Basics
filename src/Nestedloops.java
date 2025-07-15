import java.util.Scanner;
public class Nestedloops {
    public static void main(String[] args) {
        //nested loop = A loop inside another loop
        //              used often with matrices or DSA
        

      /*  for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }

       */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol you want to create a matrix with 💖: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("\nEnter the no of rows: ");
        int rows = scanner.nextInt();

        System.out.print("\nEnter the number of columns: ");
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(symbol);

            }
            System.out.println();

        }





    }
}
