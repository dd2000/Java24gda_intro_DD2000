package pl.sda._JAVA_gda24_intro.oop;

public class PrimitivesVsReferences {
    public static void main(String[] args) {
        /*
           Operacje na zmiennych typów pierwotnych
         */
        int x;
        int y;
        int z;

        x = 3;
        y = 4;
        x = y;
        y = 5;
        z = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if (x == y) {
            System.out.println("x == y");
        } else {
            System.out.println("x != y");
        }

        if (y == z) {
            System.out.println("y == z");
        } else {
            System.out.println("y != z");
        }

        /*
           Podobne operacje na zmiennych typu referencyjnego
         */
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.set(3, 3);
        p2.set(4, 4);
        p3.set(5, 5);

        p1 = p2;

        p2.set(5, 5);
        p1.set(9, 9);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.print("Point p1: ");
        p1.show();
        System.out.print("Point p2: ");
        p2.show();
        System.out.print("Point p3: ");
        p3.show();

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        if (p2 == p3) {
            System.out.println("p2 == p3");
        } else {
            System.out.println("p2 != p3");
        }

        Point p4 = new Point();
        p4.set(6, 6);

        // przypisanie adresu obiektu ze zmiennej p4 do zmiennej p5
        Point p5 = p4;

        // wyzerowanie adresu zmiennej p4
        p4 = null;

        System.out.println(p4); // =null
        System.out.println(p5); // =adres w pamięci

        if (p4 == null) {
            System.out.println("JEST");
        } else {
            System.out.println("NIE JEST");
        }
    }
}
