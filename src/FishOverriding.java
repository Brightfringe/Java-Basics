public class FishOverriding extends AnimalOverriding {

    @Override //so that you and other developers would know that this method is overridden
    void move(){
        System.out.println("this animal is swimming.");
    }
}
