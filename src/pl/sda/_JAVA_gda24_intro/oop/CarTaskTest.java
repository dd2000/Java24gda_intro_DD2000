package pl.sda._JAVA_gda24_intro.oop;

public class CarTaskTest {
    public static void main(String[] args) {
        CarTask toyota = new CarTask("Toyota", "black");
        System.out.println("My car is: " + toyota);

        CarTask mercedes = new CarTask("Mercedes", "red");
        System.out.println(mercedes);

        // ...
    }
}
