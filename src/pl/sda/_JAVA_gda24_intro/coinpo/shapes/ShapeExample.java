package pl.sda._JAVA_gda24_intro.coinpo.shapes;

public class ShapeExample {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(10);

        Shape shapeFromSquare = square;
        Shape shapeFromCircle = circle;

        Shape[] shapes = new Shape[]{
                shapeFromSquare, shapeFromCircle
        };

        for (Shape i : shapes) {
            System.out.println(i);

            if (i instanceof Square) {
                Square squareFromShape = (Square) i; // cast - kastowanie jest wymagane
            }
            if (i instanceof Circle) {
                Circle circleFromShape = (Circle) i; // cast - kastowanie jest wymagane
            }
        }
    }
}
