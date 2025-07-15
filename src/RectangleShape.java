public class RectangleShape extends ShapeAbstract{

    double length;
    double width;

    RectangleShape(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return  length * width;
    }
}
