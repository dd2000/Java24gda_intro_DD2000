package pl.sda._JAVA_gda24_intro.oop;

public class Triangle {

    public boolean isRectangular(int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return true;
        }
        return false;
    }

//    public boolean isRectangular(int a, int a2, int c) {
//        boolean isRectangular = false;
//        if (c * c == a * a + a2 * a2) {
//            isRectangular = true;
//        }
//        return isRectangular;
//    }

//    public boolean isRectangular(int a, int a2, int c) {
//        return c * c == a * a + a2 * a2;
//    }

    public void print(int a) {
        if (a > 3) {
            System.out.println("> 3!");
        }
        System.out.println("< 3!");
    }

}
