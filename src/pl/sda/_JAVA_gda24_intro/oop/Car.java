package pl.sda._JAVA_gda24_intro.oop;

public class Car {
    private String brand = "Toyota";
    private String color;
    private int speed;

    private boolean isMoving = false;

    public Car() {}

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (isMoving) {
            this.speed = speed;
        } else {
            System.out.println("Can't set speed!");
        }
    }

    public void start() {
        isMoving = true;
        System.out.println("Car was started!");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", color='" + color + '\'' +
//                ", speed=" + speed +
//                ", isMoving=" + isMoving +
//                '}';
//    }
}
