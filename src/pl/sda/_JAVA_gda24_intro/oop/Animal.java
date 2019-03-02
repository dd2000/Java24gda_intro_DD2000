package pl.sda._JAVA_gda24_intro.oop;

public class Animal {
    private String genre;
    private String color;
    private int age;
    private int numberOfLegs;
    private String sex;

    private boolean isMoving;

    public Animal(String genre, String color, int age) {
        this.genre = genre;
        this.color = color;
        this.age = age;
    }

    public void move() {
        isMoving = true;
    }

    public String display() {
        return "Genre: " + genre + " color: " + color + " age: " + age;
    }

    // ALT + INSERT -> Setter -> z menu wybieramy z wciśniętym klawiszem CTRL pola,
    // które chcemy by zostały wygenerowane

    // getter pobierający wartość pola `genre`
    public String getGenre() {
        return genre;
    }

    // setter ustawiający wartość pola `genre`
    public void setGenre(String genre) {
        int z = 1 + 3; // zmienna lokalna
        this.genre = genre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "genre='" + genre + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", sex='" + sex + '\'' +
                ", isMoving=" + isMoving +
                '}';
    }
}
