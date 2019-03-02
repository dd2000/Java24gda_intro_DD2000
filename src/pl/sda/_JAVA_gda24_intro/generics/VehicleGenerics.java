package pl.sda._JAVA_gda24_intro.generics;

public class VehicleGenerics<T> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Car car = new Car();
        VehicleGenerics<Car> vehicleGenerics = new VehicleGenerics<>();
        vehicleGenerics.set(car);
    }
}
