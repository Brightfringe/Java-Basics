public class EngineComposition {

    String type;

    EngineComposition(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type);
    }



}
