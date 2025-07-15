import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\shubh\\OneDrive\\Desktop\\test.txt";
        String textContent = "i like pizza\nits really good\nbuy mw pizza";

        try(FileWriter writer = new FileWriter(filePath)){

            writer.write(textContent);
            System.out.println("file has been written");

        }catch (FileNotFoundException e){

            System.out.println("could not locate file locations");

        }
        catch (IOException E){
            System.out.println("could not write file");
        }
    }
}
