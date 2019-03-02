package pl.sda._JAVA_gda24_intro.coinpo;

import pl.sda._JAVA_gda24_intro.coinpo.shapes.Circle;
import pl.sda._JAVA_gda24_intro.coinpo.shapes.Rectangle;
import pl.sda._JAVA_gda24_intro.coinpo.shapes.Shape;
import pl.sda._JAVA_gda24_intro.coinpo.shapes.Square;

public class ReferenceConversion {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(10, 3.4);

        Shape circleAsShape = circle;
        System.out.println("circleAsShape = " + circleAsShape);
        System.out.println("circleAsShape area = " + circleAsShape.getArea());

//        double radius = circleAsShape.getRadius(); // won't compile
        double radius = ((Circle) circleAsShape).getRadius();
        System.out.println("circleAsShape radius = " + radius);

        System.out.println();
        Shape[] shapes = createArray(circle, square, rectangle);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Circle radius: " + ((Circle) shape).getRadius());
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle width: " + ((Rectangle) shape).getWidth()
                        + " height: " + ((Rectangle) shape).getHeight());
            }
        }
    }

    private static Shape[] createArray(Shape shape1, Shape shape2, Shape shape3) {
        return new Shape[]{shape1, shape2, shape3};
    }
}
