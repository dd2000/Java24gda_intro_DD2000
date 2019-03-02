package pl.sda._JAVA_gda24_intro.collections;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Car{" +
            "name='" + name + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S");
        Car car2 = new Car("Tesla Model X");

        System.out.println(car1.compareTo(car2));
    }
}
