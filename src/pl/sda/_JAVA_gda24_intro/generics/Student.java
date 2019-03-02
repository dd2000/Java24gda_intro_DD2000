package pl.sda._JAVA_gda24_intro.generics;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{} - " + super.toString();
    }
}
