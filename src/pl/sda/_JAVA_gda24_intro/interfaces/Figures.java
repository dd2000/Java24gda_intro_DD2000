package pl.sda._JAVA_gda24_intro.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
//        rect.print();
//        rect.draw();

        Circle circle = new Circle(10);
//        circle.print();

        Triangle triangle = new Triangle(3, 5);
//        triangle.print();
//        triangle.draw();

//        List<Rectangle> recs = new ArrayList<>();
//        recs.add(rect);
//        recs.add(new Rectangle(10, 20));
//
//        List<Circle> circles = new ArrayList<>();
//        circles.add(circle);
//        circles.add(new Circle(99));
//
//        List<Triangle> triangles = new ArrayList<>();
//        triangles.add(triangle);
//        triangles.add(new Triangle(5, 9));
//        triangles.add(new Triangle(6, 12));

//        double sumOfFiguresArea = 0.0;
//        double sumOfFiguresPerimeter = 0.0;
//        for (Rectangle rectangle : recs) {
//            sumOfFiguresArea += rectangle.getArea();
//            sumOfFiguresPerimeter += rectangle.getPerimeter();
//        }
//        System.out.println("Sum of rectangles area: " + sumOfFiguresArea);
//        System.out.println("Sum of rectangles perimeter: " + sumOfFiguresPerimeter);
//
//        // to samo analogicznie dla pozostalych kolekcji

        List<Figure> figures = new ArrayList<>();
        figures.add(rect);
        figures.add(circle);
        figures.add(triangle);

//        double sumOfFiguresArea = 0.0;
//        double sumOfFiguresPerimeter = 0.0;
//        for (Figure figure : figures) {
//            sumOfFiguresArea += figure.getArea();
//            sumOfFiguresPerimeter += figure.getPerimeter();
//        }
//        System.out.println("Sum of figures area: " + sumOfFiguresArea);
//        System.out.println("Sum of figures perimeter: " + sumOfFiguresPerimeter);

        double sumOfFiguresArea = 0.0;
        double sumOfFiguresPerimeter = 0.0;
        Iterator<Figure> iterator = figures.iterator();
        while (iterator.hasNext()) {
            Figure figure = iterator.next();
            sumOfFiguresArea += figure.getArea();
            sumOfFiguresPerimeter += figure.getPerimeter();
        }
        System.out.println("Sum of figures area: " + sumOfFiguresArea);
        System.out.println("Sum of figures perimeter: " + sumOfFiguresPerimeter);
    }
}