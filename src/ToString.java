public class ToString {
    public static void main(String[] args) {
        CarToStrings car1 = new CarToStrings("Ford","mustang",2025,"red");
        CarToStrings car2 = new CarToStrings("chevrolet","corvette",2026,"Blue");

    /*  after making the override toString methos */ System.out.println(car1); //gets hash code as an output (before using toString method)
    //    System.out.println(car.make +" "+ car.color + " " + car.year + " " + car.model); //we write this to get the desired answer
        System.out.println(car2);

    }

}
