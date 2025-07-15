public class MethodOverriding {
    public static void main(String[] args) {
        DogOverriding dog = new DogOverriding();
        CatOverriding cat = new CatOverriding();
        FishOverriding fish = new FishOverriding();

        dog.move();
        cat.move();
        fish.move();
    }
}
