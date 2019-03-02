package pl.sda._JAVA_gda24_intro.coinpo.polymorphism;

import pl.sda._JAVA_gda24_intro.coinpo.shapes.Rectangle;
import pl.sda._JAVA_gda24_intro.coinpo.shapes.Shape;
import pl.sda._JAVA_gda24_intro.coinpo.shapes.Square;

public class PolymorphismExample {
    public static void main(String[] args) {
        Square square = new Square(10);
        Object objectFromSquare = square;
        Shape shapeFromSquare = square;

        System.out.println(square.getType());
        System.out.println(shapeFromSquare.getType());

        Rectangle rectangle = new Rectangle(10, 20);
        Shape shapeFromRectangle = rectangle;

        System.out.println(rectangle.getType());
        System.out.println(shapeFromRectangle.getType());
    }
}
