package pl.sda.t01_d2niedz1_oop;

public class Car {
    private String brandt;
    private String color;

    public Car(String brandt, String color) {
        this.brandt = brandt;
        this.color = color;
    }

    @Override
    public String toString() {
        return "pl.sda.t01_d2niedz1_oop.Car{" +
                "brandt='" + brandt + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
} // pl.sda.t01_d2niedz1_oop.Car class
