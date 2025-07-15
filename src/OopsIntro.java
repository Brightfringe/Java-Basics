import java.util.Random;
import java.util.Scanner;
public class OopsIntro {
    public static void main(String[] args) {
        //object = An entry that holds data (attributes)
        //         and can perform actions(methods)
        //         It is a reference data type

       // Scanner scanner = new Scanner(System.in);
       // Random random = new Random();

        Car car = new Car();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

       // car.drive();
       // car.brake();
/*
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.make);

 */
    }
}
