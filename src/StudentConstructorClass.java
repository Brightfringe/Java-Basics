public class StudentConstructorClass {

    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    StudentConstructorClass (String a,int b,double c){
        this.name = a;
        this.age =  b;
        this.gpa =  c;
        this.isEnrolled = true;

    }
    void study(){
        System.out.println(this.name + " is studying");
    }

}
