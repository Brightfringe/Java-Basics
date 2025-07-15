import java.util.concurrent.Callable;

public class GettersSetters {
    public static void main(String[] args) {

        CarGetterSetter car = new CarGetterSetter("charger","yellow",10000000);

        car.setColor("blue");
        car.setPrice(-1);

        System.out.println(car.getModel()+ " " + car.getColor() + " " + car.getPrice());
    }
}
