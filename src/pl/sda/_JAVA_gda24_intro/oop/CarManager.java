package pl.sda._JAVA_gda24_intro.oop;

public class CarManager {

    public static void main(String[] args) {
//        Car car;  // = null
//        car = new Car();

//        System.out.println(car);

        Car car1 = new Car("Toyota", "white");
        Car car2 = new Car("BMW", "black");
//        Car car3 = new Car("black");

//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);

        car1.setSpeed(50);
        car2.setSpeed(75);

        System.out.println(car1);
        System.out.println(car2);

        car1.start();
        car2.start();

        car1.setSpeed(50);
        car2.setSpeed(75);

        System.out.println(car1);
        System.out.println(car2);
    }

}
