package pl.sda._JAVA_gda24_intro.interfaces;

public class Circle implements Figure {
    private final double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}