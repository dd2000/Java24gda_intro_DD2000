package pl.sda._JAVA_gda24_intro.functional;

import pl.sda._JAVA_gda24_intro.generics.Person;
import pl.sda._JAVA_gda24_intro.generics.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    private static final List<Student> STUDENTS = Arrays.asList(
        new Student("Maciek", "Rzepiński"),
        new Student("Jan", "Kowalski"),
        new Student("Jan", "Nowak")
    );

    public static void main(String[] args) {
        printLambda();

        String reduce = STUDENTS.stream()
            .map(Person::getFirstName)
            .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(reduce);

        List<Student> students = STUDENTS.stream()
            .filter(student -> "Jan".equals(student.getFirstName()))
            .map(student -> {
                System.out.println(student);
                return new Student(
                    student.getFirstName().toUpperCase(),
                    student.getLastName().toUpperCase()
                );
            })
            .sorted(Comparator.comparing(Person::getFirstName))
            .collect(Collectors.toList());

        if (!students.isEmpty()) {
            students.forEach(System.out::println);
        }
    }

    private static void printForeach() {
        for (Student student : STUDENTS) {
            System.out.println(student);
        }
    }

    private static void printLambda() {
        STUDENTS.forEach(System.out::println);
    }
}
