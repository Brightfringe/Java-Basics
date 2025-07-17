import java.util.ArrayList;
import java.util.Random;
public class HangmanClass {

    public ArrayList<String> words;

    public HangmanClass() {
        words = new ArrayList<>();
        words.add("COMPILER");
        words.add("ARRAY");
        words.add("RECURSION");
        words.add("SYNTAX");
        words.add("BOOLEAN");
        words.add("POINTER");
        words.add("CLASS");

    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}

