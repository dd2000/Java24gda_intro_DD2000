package pl.sda._JAVA_gda24_intro.interfaces;

public class Triangle implements Figure, Drawable {
    private final double a;
    private final double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * a;
    }

    @Override
    public void draw() {
        System.out.println("   #");
        System.out.println("  # #");
        System.out.println(" #   #");
        System.out.println("#######");
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
