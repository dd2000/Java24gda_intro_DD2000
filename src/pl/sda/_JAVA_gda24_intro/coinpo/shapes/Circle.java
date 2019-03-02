package pl.sda._JAVA_gda24_intro.coinpo.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle", Math.PI * (radius * radius));
        this.radius = radius;
    }

    public double getRadius() { //metoda własna obiektu Circle, po za tym dziedziczona jest metoda getArea i toString z Shape
        return radius;
    }
}