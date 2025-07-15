import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        String fruits[] = {"apple","orange","banana"};

       fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

      //  System.out.println(fruits[0]);

      //  for (int i = 0; i < fruits.length; i++){
        //    System.out.print(fruits[i]+ " ");
      //  }
        Arrays.sort(fruits);
        Arrays.fill(fruits,"tamatar");
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
