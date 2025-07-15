public class Super {
    public static void main(String[] args) {
        PersonSuper person = new PersonSuper("Tome", "rose");
        StudentPerson student = new StudentPerson("harry","poter",3.3);
        EmployeePerson employee = new EmployeePerson("tamatar","tambii",40000);

        person.showName();
        student.showName();

        employee.showName();
        employee.showSalary();

        System.out.println(student.gpa);
        student.showGPA();

    }
}
