package pl.sda.t01_d2niedz2_oop2;

public class TriangleAPP {
    public static void main(String[] args) {

        // tworzenie obiektu o nazwie triangle klasy pl.sda.t01_d2niedz2_oop2.Triangle o zadanych wymiarach a,b,c
        Triangle triangle = new Triangle(5,3,4);

        //
        if (triangle.checkTriangle() == true)
        {
            System.out.println("\nTrójkąt jest prostokątny.");
        }
        else
        {
            System.out.println("\nTrójkąt NIE JEST prostokątny.");
        }
    } // main
} // pl.sda.t01_d2niedz2_oop2.TriangleAPP
