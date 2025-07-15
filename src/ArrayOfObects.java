public class ArrayOfObects {
    public static void main(String[] args) {

      /*  CarForArrayOfObjects car1 = new CarForArrayOfObjects("Mustang","red");
        CarForArrayOfObjects car2 = new CarForArrayOfObjects("Corvett","blue");
        CarForArrayOfObjects car3 = new CarForArrayOfObjects("Charger","yellow");

        CarForArrayOfObjects [] cars = {car1,car2,car3};

       */
        CarForArrayOfObjects[] cars = {new CarForArrayOfObjects("Mustang","red"),new CarForArrayOfObjects("corvette","blue"),new CarForArrayOfObjects("charger","yellow")};
        /*
        System.out.println(cars[0].drive()); // this statement wont work because sout does not recieve "void"(since we are using void in the drive method)
        cars[0].drive(); // this will work as it does not use sout(since sout does not receive void

         */

       /* for (int i = 0; i < cars.length; i++ ){
            cars[i].drive();
        }
        
        */
        for (CarForArrayOfObjects car: cars) {
            car.color = "Black";
        }

        for (CarForArrayOfObjects car:cars) {
            car.drive();
        }


    }
}
