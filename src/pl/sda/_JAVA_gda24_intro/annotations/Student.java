package pl.sda._JAVA_gda24_intro.annotations;

@Info(
    author = "mrzepinski",
    date = "25.11.2018",
    desc = "Class for Student object"
)
public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Info(
        author = "mrzepinski",
        date = "25.11.2018",
        desc = "Get student first name"
    )
    public String getFirstName() {
        return firstName;
    }

    @Info(
        author = "mrzepinski",
        date = "25.11.2018",
        desc = "Get student last name"
    )
    public String getLastName() {
        return lastName;
    }

    @Info(
        author = "mrzepinski",
        date = "25.11.2018",
        desc = "Get student age"
    )
    public int getAge() {
        return age;
    }
}
