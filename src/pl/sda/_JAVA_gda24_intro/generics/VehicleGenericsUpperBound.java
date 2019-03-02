package pl.sda._JAVA_gda24_intro.generics;

public class VehicleGenericsUpperBound<T extends Car> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Car car = new Car();
        VehicleGenericsUpperBound<Car> vehicleGenerics = new VehicleGenericsUpperBound<>();
        vehicleGenerics.set(car);
    }
}
