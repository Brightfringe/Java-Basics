import java.util.Scanner;
public class Forloops {
    public static void main(String[] args) throws InterruptedException {
        //for loop:

       /* for (int i = 1; i <= 10; i+=2) {

            System.out.println(i);


        }

        */

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

       for (int i =0;i<max;i++){
           System.out.println(i);
       }

        */
        int start = 10;

        for (int i = start; i >0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("happy new year");

    }

}
