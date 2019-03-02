package pl.sda._JAVA_gda24_intro.interfaces;

public class Rectangle implements Figure, Drawable {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("#######");
        System.out.println("#     #");
        System.out.println("#     #");
        System.out.println("#######");
    }
}
