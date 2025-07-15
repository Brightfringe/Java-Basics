import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();

        map.put("apple",0.50);
        map.put("banana",0.50);
        map.put("tamatar",0.50);

      //  map.remove("aaple");

       // System.out.println(map.get("apple"));

        for (String key:map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
