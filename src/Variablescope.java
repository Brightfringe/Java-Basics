import java.util.Scanner;
public class Variablescope {
    static int x = 3; //Class
    public static void main(String[] args) {
        int x = 1; //Local
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){

        int x = 2; //Local

        System.out.println(x);
    }
}
