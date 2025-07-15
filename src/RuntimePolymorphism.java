import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnimalRuntimePoly animal ;

        System.out.println("would you like a dog or car(1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new DogAnimalPoly();
            animal.speak();
        }
        else if (choice == 2){
            animal = new CatAnimalPoly();
            animal.speak();
        }

    }
}
