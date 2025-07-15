public class Car {

    String make = "ford";
    String model = "mustang";
    int year = 2025;
    double price = 5800.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("you start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("you stop the engin");
    }

    void drive(){
        System.out.println("you drive a "+ model);
    }
    void brake(){
        System.out.println("you brake the "+model);
    }
}
