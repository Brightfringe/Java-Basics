public class StudentPerson extends PersonSuper {
    double gpa;
    StudentPerson(String first,String last,double gpa){
        super(first,last); // imagine that we replace the super keyword with "PersonSuper"
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa );
    }
}
