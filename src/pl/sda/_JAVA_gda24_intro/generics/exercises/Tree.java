package pl.sda._JAVA_gda24_intro.generics.exercises;

public class Tree implements Plants {
    private String name;
    private int age;

    public Tree(String name, int age) {
        this.name = "Drzewo: " + name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
