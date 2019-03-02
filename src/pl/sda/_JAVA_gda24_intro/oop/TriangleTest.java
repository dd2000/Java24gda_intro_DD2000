package pl.sda._JAVA_gda24_intro.oop;

public class TriangleTest {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        boolean isRectangular = triangle.isRectangular(3, 4, 5);

        System.out.println(isRectangular);

        triangle.print(4);
    }

}
