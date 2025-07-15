
public class Generics {
    public static void main(String[] args) {

        BoxGenerics<Integer> box = new BoxGenerics<>();

        box.setItem(52);

        System.out.println(box.getItem());

    }
}
