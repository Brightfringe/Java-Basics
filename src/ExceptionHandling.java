import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("enter a number: ");
            int number = scanner.nextInt();
            System.out.println("number");
        }catch (InputMismatchException e){
            System.out.println("that wasnt a number!");
        }
        catch (ArithmeticException e){
            System.out.println("you cant divide by zero");
        }
        catch (Exception e){
            //Safety net
            System.out.println("something went wrong");
        }
        //executes no matter what
        finally {
            scanner.close();
            System.out.println("this always executes!");
        }
    }
}
