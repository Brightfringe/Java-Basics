public class CarComposition {

    String model;
    int year;
    EngineComposition engine;

    CarComposition(String model,int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine = new EngineComposition(engineType);

    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }

}
