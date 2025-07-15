import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        //How to play audio with java (.wav, .au, .aiff)

        String filePath = "src\\Khayaal  Arijit Anand  Ankita Barwad  (New Song).wav";
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(System.in)){

            AudioInputStream  audioStream = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response ="";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = Exit");
                System.out.print("enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("no matching key");

                }
            }

        }
        catch (IOException e){
            System.out.println("something went wrong");
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        finally {

            System.out.println("bye!");
        }
    }
}
