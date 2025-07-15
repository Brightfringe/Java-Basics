public class Constructors {
    public static void main(String[] args) {


        StudentConstructorClass student1 = new StudentConstructorClass("nonu", 30, 3.2);
        StudentConstructorClass student2 = new StudentConstructorClass("tamatar", 45, 1.5);
        StudentConstructorClass student3 = new StudentConstructorClass("sandy",27,3.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
