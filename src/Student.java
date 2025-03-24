public class Student extends Person {
    double cgpa;

    Student() {}

    Student(String firstName, String lastName, int age,String Gender, double cgpa) {
        super(firstName, lastName, age, Gender);
        this.cgpa = cgpa;
    }

    @Override
    void showStudentInfo() {
        System.out.println(fName + " " + lName + " " + age + " " + gender + " " + cgpa);
    }

}
