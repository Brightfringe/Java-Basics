public class Abstraction {
    public static void main(String[] args) {
       CircleShape circle = new CircleShape(2);
       TriangleShape triangle = new TriangleShape(2,4);
       RectangleShape rectangle = new RectangleShape(6,7);

       circle.display();
       triangle.display();
       rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
