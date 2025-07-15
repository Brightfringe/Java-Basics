public class Polymorphism {
    public static void main(String[] args) {

        CarVehicle car = new CarVehicle();
        BikeVehicle bike = new BikeVehicle();
        BoatVehicle boat = new BoatVehicle();

        VehiclePoly[] vehicle = {car,bike,boat};

        for (VehiclePoly vehicles:vehicle) {
            vehicles.go();
        }

       // car.go();
        //bike.go();
        //boat.go();

    }
}
