package pl.sda._JAVA_gda24_intro.annotations;

@Info(
    author = "mrzepinski",
    date = "25.11.2018",
    desc = "Class for School object"
)
public class School {
    private final String name;

    public School(String name) {
        this.name = name;
    }

    @Info(
        author = "mrzepinski",
        date = "25.11.2018",
        desc = "Get School name"
    )
    public String getName() {
        return name;
    }
}
