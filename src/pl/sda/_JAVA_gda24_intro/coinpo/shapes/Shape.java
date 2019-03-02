package pl.sda._JAVA_gda24_intro.coinpo.shapes;

public class Shape {
    private String type;
    private double area;

    public Shape(String type, double area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return type + "[area: " + area + " m2]";
    }
}
