public class FishInterface implements PreyInterface,PredatorInterface{

    @Override
    public void flee(){
        System.out.println("The fish is running away");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}
