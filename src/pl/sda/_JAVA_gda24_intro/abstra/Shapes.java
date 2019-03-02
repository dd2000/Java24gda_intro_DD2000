package pl.sda._JAVA_gda24_intro.abstra;

import pl.sda._JAVA_gda24_intro.abstra.shapes.Circle;
import pl.sda._JAVA_gda24_intro.abstra.shapes.Rectangle;
import pl.sda._JAVA_gda24_intro.abstra.shapes.Shape;

public class Shapes {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}