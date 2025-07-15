import java.util.Scanner;
import java.util.Arrays;
public class SearchAnArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 87, 44, 33, 55};
        int target = 90;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array");
        }
    }
}
