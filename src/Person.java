public class Person {
    String fName;
    String lName;
    int age;
    String gender;

    Person() {}

    Person(String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    void showStudentInfo() {
        System.out.println(fName + " " + lName + " " + age + " " + gender);
    }
}
