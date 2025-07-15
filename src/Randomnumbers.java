import java.util.Random;

public class Randomnumbers {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("heads");
        }
        else {
            System.out.println("tails");
        }

    }


}
