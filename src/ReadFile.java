import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String filePth = "C:\\Users\\shubh\\OneDrive\\Desktop\\test.txt";

       try(BufferedReader reader = new BufferedReader(new FileReader(filePth))){
           String line;
           while((line = reader.readLine()) != null){
               System.out.println(line);
           }

       }
       catch (FileNotFoundException e){
           System.out.println("could not locate file");
       }
       catch (IOException e){

           System.out.println("something went wrong");
       }
    }
}
