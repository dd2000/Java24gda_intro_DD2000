package pl.sda._JAVA_gda24_intro.oop;

public class WeirdExamples {
    public static void main(String[] args) {
//        int x = 10;
//        increment(x); // y wewnątrz metody otrzymuje wartość = x
//        System.out.println("x = " + x);

        Car car1 = new Car("Audi", "black");
        Car car2 = new Car("Toyota", "white");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());

        switchCars(car1, car2);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
    }

    public static void increment(int y) { // przekazana wartość przekazywana jest przez wartość
        // przekazana wartość to kopia wartości `x`
        System.out.println("y = " + y);
        ++y;
        System.out.println("y = " + y);
    }

    public static void switchCars(Car car1, Car car2) {
        Car tmp = car1;
        car1 = car2;
        car2 = tmp;
        car1.setBrand("Ford");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
    }
}
