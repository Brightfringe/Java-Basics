public class TriangleShape extends ShapeAbstract{

    double base;
    double height;

    TriangleShape(double base,double height){
        this.base = base;
        this.height= height;
    }

    @Override
    double area(){
        return  0.5 * base * height;
    }
}
