import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyRunnableThreading myrunnable = new MyRunnableThreading();
        Thread thread = new Thread(myrunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
