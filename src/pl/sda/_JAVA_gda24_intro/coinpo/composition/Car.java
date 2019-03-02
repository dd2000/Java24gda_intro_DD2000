package pl.sda._JAVA_gda24_intro.coinpo.composition;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`

    public Car(String brand, Engine engine) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start(); // wywołanie metody na obiekcie `Engine`
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
