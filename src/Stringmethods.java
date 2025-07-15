import java.util.Scanner;
public class Stringmethods {
    public static void main(String[] args) {

        String name = "Bro code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIdex = name.lastIndexOf("o");

       // name = name.toUpperCase();
       // name = name.toLowerCase();
     //   name = name.trim();
        name = name.replace("o","a");

      //  System.out.println(length);
       // System.out.println(letter);
      //  System.out.println(index);
     //   System.out.println(lastIdex);
        System.out.println(name.isEmpty());

    }
}
