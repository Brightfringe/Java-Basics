public class Inheritance {
    public static void main(String[] args) {

        DogsAnimal dog = new DogsAnimal();
        CatsAnimals cat = new CatsAnimals();
        PlantOrganism plant = new PlantOrganism();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

    }

}
