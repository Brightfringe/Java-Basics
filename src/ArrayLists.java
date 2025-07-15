import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args) {

     /* ArrayList<Integer> list = new ArrayList<>();

      list.add(3);
      list.add(3);
      list.add(4);
      list.add(5);

        System.out.println(list);



        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");

        //fruits.remove(0);
        fruits.set(0,"tamatar");


        System.out.println(fruits.get(3));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);

        for (String fruit:fruits) {
            System.out.println(fruit);
        }

      */
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the no. of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<= numOfFood; i++){
            System.out.println("enter food no." + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        scanner.close();

    }
}
