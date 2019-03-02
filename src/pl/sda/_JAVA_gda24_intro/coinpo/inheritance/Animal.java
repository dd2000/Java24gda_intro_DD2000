package pl.sda._JAVA_gda24_intro.coinpo.inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name) { // 1
        this(name, 10);     // 2
//        this.name = name;
//        this.age = 10;
        System.out.println("Animal was created!"); // 7
    } // 8

    public Animal(String name, int age) { // 3
        this.name = name; // 4
        this.age = age;   // 5
    } // 6

    //    public Animal(String name) {
//        this.name = name;
//    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Animal is moving!");
    }

    public void move(int speed) {
        System.out.println("Animal is moving, speed: " + speed + "!");
    }

    public void move(String destination) {
        System.out.println("Animal is moving, destination: " + destination + "!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
