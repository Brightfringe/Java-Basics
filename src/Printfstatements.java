import java.util.Scanner;
public class Printfstatements {
    public static void main(String[] args) {
      /*  String name = "subhi";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);//%s for strings
        System.out.printf("your name starts with a %c",firstLetter);//%c for char
        System.out.printf("you are %d years old \n",age); //%d for int
        System.out.printf("you are %f inches tall\n",height);//%f for double
        System.out.printf("employed: %b\n",isEmployed);//%b for boolean

        //can di in same line too

        System.out.printf("%s is %d years old",name,age);

       */

      /*  double price1 = 9.99;
        double price2 = 10.15;
        double price3 = -54.01;

        System.out.printf("%(.2f",price1);
        System.out.printf("\n%.2f",price2);
        System.out.printf("\n% .2f",price3);

       */
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d",id1);
        System.out.printf("\n%-4d",id2);
        System.out.printf("\n%-4d",id3);
        System.out.printf("\n%-4d",id4);
    }
}
