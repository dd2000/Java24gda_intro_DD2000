package pl.sda._JAVA_gda24_intro.statements;

public class IfStatements {
    public static void main(String[] args) {
        /*
           Prosty if z jedną instrukcją + if z blokiem (instrukcją grupującą)
         */
        int a = 1, b = 10, c = 0, d = 0;
        if (a < b) System.out.println("a < a2");

        /*if (a < a2) { //to samo co wyżej tylko jako jedno-elementowy blok
            System.out.println("a < a2");
        }*/

        /*if (a < a2) {
            System.out.println("a < a2");
            c = a + a2;
            d = a2 - a;
            System.out.println("c = " + c);
            System.out.println("d = " + d);
        } //średnik nie jest potrzebny!*/

        /*
           Konstrukcja if-else
         */
        /*if (c > d) {
            System.out.println("c > d");
        } else {
            System.out.println("c <= d");
        }

        if (a + 1 > d / 3) { //operatory relacyjne mają niższy priorytet od arytmetycznych, nie musimy pisać: if((a + 1) > (d / 3))
            System.out.println("a + 1 > d / 3");
        } else {
            System.out.println("a + 1 <= d / 3");
        }

        boolean result = a + 1 > d / 3; //operatory relacyjne mają wyższy priorytet od przypisania, nie musimy pisać: boolean result = (a + 1 > d / 3);

        a = 10;
        a2 = 20;
        c = 30;
        //instrukcje if można zagnieżdżać
        if(a > 0 || a < 0) {
            if(a2 / a > c) {
                System.out.println("a2 / a > c");
            } else if(a2 / a == 2) {
                System.out.println("a / a2 == 2");
            } else {
                System.out.println("other");
            }
        } else {
            System.out.println("a == 0");
        }*/

        /*
           Błędne użycie instrukcji if-else
         */

        //brak powiązania między warunkami (czyli użycia else)
        /*a = 1001;
        if(a > 1000) {
            System.out.println("big number");
        }
        if(a > 100) {
            System.out.println("medium number");
        }
        if(a > 10) {
            System.out.println("small number");
        }*/

        //nieprawidłowa kolejność sprawdzania warunków
        /*a = 1000;
        if(a >= 10) {
            System.out.println("small number");
        } else if(a >= 100) {
            System.out.println("medium number");
        } else if(a >= 1000) {
            System.out.println("big number");
        }*/

        /*//a co jak żaden warunek nie będzie spełniony?
        a = 1;
        if(a >= 1000) {
            System.out.println("big number");
        } else if(a >= 100) {
            System.out.println("medium number");
        } else if(a >= 10) {
            System.out.println("small number");
        } else { //wtedy przydaje się sam else na końcu
            System.out.println("tiny number");
        }*/
    }
}
