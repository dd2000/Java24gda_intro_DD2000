package pl.sda._JAVA_gda24_intro.coinpo.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String type, double width, double height) {
        super(type, width * height); // first instruction
        this.width = width;
        this.height = height;
    }

    // overroded constructor
    public Rectangle(double width, double height) {
        this("Rectangle", width, height);
    }

    public double getWidth() { //metoda własna obiektu Rectangle
        return width;
    }

    public double getHeight() { //metoda własna obiektu Rectangle
        return height;
    }
}
