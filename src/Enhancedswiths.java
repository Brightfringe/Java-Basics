import java.util.Scanner;
public class Enhancedswiths {
    public static void main(String[] args) {
        // Enhanced switch = a replacement to many else if atements
        // (java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of a week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day){
            case "monday" , "tuesday" , "wednesday" , "thursday" ,"friday" -> System.out.println("is it a weekday");
            case "saturday","sunday"-> System.out.println("it is the weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}
