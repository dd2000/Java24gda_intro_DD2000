package pl.sda._JAVA_gda24_intro.oop;

public class CarTask {

    private String brand;
    private String color;

    public CarTask(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarTask{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
