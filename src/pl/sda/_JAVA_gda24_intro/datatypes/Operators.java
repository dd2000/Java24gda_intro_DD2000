package pl.sda._JAVA_gda24_intro.datatypes;

public class Operators {
    public static void main(String[] args) {
        /*
           Prosta arytmetyka
         */
        int result = 1 + 2; // = 3
        System.out.println(result);

        result = result - 1; // = 2
        System.out.println(result);

        result = result * 2; // = 4
        System.out.println(result);

        result = result / 2; // = 2
        System.out.println(result);

        //dzielenie całkowitoliczbowe vs rzeczywiste
        /*final int MAX_SIZE = 15;
        int size = 6;
        int count = MAX_SIZE / size;// = 2
        System.out.println(count);
        int theRest = MAX_SIZE % size;// = 3
        System.out.println(theRest);
        double capacityPercent = MAX_SIZE / (double) size;// = 2.5
        System.out.println(capacityPercent);
        capacityPercent = MAX_SIZE / 2.5;// = 6.0
        System.out.println(capacityPercent);
        capacityPercent = MAX_SIZE / 10d;// = 1.5
        System.out.println(capacityPercent);*/

        /*
           Zwiększanie/zmniejszanie o 1 - forma przedrostkowa vs przyrostkowa
         */
        /*int a = 1, a2 = 2, c = 3;
        a = a2 = c * 3 + 2;
        System.out.println("a = " + a + " a2 = " + a2 + " c = " + c);
        a = a2++; //zwiększanie o jeden - forma przyrostkowa - najpierw wykonaj operację przypisania potem zwiększ o 1
        System.out.println("a = " + a + " a2 = " + a2 + " c = " + c);
        c = --a2; //zwiększanie o jeden - forma przedrostkowa - najpierw zwiększ o 1 potem wykonaj operację przypisania
        System.out.println("a = " + a + " a2 = " + a2 + " c = " + c);
        a++;
        a2++;
        c++;
        System.out.println("a = " + a + " a2 = " + a2 + " c = " + c);
        a =  a2++ * ++c;
        System.out.println("a = " + a + " a2 = " + a2 + " c = " + c);*/

        /*
           Operacje logiczne
         */
        /*byte x = 10;
        short y = 15;
        boolean isTrue = x + 1 >= y - 4;
        System.out.println("x + 1 >= y - 4 is = " + isTrue);
        System.out.println("!isTrue is = " + !isTrue);
        x++;
        y--;
        //System.out.println("x == y = " + x == y); -- tak się nie skompiluje
        System.out.println("x == y = " + (x == y));
        x++;
        y-=2;
        System.out.println("x == y = " + (x == y));*/

        /*
           Przypisania złożone
        */
        /*byte x1 = 10;
        byte y1 = 2;
        y1 *= 20; // zamiast y1 = y1 * 10;
        System.out.println("y1 = " + y1);
        x1 += y1; // zamiast x1 = x1 + y1;
        System.out.println("x1 = " + x1);
        x1 += 200; //poza zasięg byte
        System.out.println("x1 = " + x1);
        x1 = 100;
        x1 /= 5; // zamiast x1 = x1 / 5;
        System.out.println("x1 = " + x1);
        y1 -= x1 * 3; // zamiast y1 = y1 - (x1 * 3);
        System.out.println("y1 = " + y1);*/

        /*
           Konwersje arytmetyczne
        */
        /*byte b1 = 10;
        short s1 = b1;
        float f1 = b1;
        char c1 = (char) b1; // char c1 = b1; - błąd kompilacji!
        System.out.println("b1 = " + b1 + " s1 = " + s1 + " f1 = " + f1 + " c1 = " + (int) c1); // (int) c jawna konwersja rozszerzająca - żeby wyświetlić int a nie znak

        short s2 = 14;
        //short s3 = s1 + s2; // - błąd kompilacji!
        int i = s1 + s2; // - promocja numeryczna do int (mimo że dodajemy dwie zmienne typu short)!
        System.out.println("i = " + i);

        char c2 = 'a';
        int code = c2;
        System.out.println("Code for " + c2 + " = " + code);
        code = 77;
        c2 = (char) code;
        System.out.println("Code for " + c2 + " = " + code);

        //czasem trzeba użyć jawnej konwersji rozszerzającej
        System.out.println("Code for " + '*' + " = " + (int) '*');

        //oczywiście - zawężające trzeba zawsze podać jawnie
        System.out.println("Code for " + (char) 66 + " = " + 66);*/
    }
}