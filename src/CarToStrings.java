public class CarToStrings {
    String make;
    String model;
    int year;
    String color;

    CarToStrings(String make,String model,int year,String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    @Override
    public String toString(){
        return this.make +" "+ this.color + " " + this.year + " " + this.model;
    }
}
