public class CircleShape extends ShapeAbstract{

    double radius;

    CircleShape(double radius){
        this.radius = radius;
    }

    @Override
   double area(){
        return  Math.PI * radius * radius;
    }
}
