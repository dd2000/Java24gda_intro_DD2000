package pl.sda._JAVA_gda24_intro.datatypes;

public class LiveCoding {
    public static void main(String[] args) {
        //deklaracja i incjalizacja danych
        int x;
        x = 100_000_000;

        final int SMALL_NUMBER_OF_SOMETHING = 8;
        int smallNumberOfSomething = 8;
        float d = .6F;

        char c = 346;
        int symbol = c;
        System.out.println("symbol = " + symbol);
        System.out.println("c = " + c);

        String str = "Ala ma kota";

        boolean b = true;

        //operacje na danych
        int a1 = 10;
        int a2 = 11;
        int a3 = 10;

        int b1 = 90, b2 =70, b3 = 100;

        a1 = b1 = b3 = a1 + 10;

        //konwersje danych
        byte mySmallNumber = 10;
        int mediumNumber = mySmallNumber;
        byte newSmallNumber = (byte) mediumNumber;

        System.out.println("mySmallNumber = " + mySmallNumber);
        System.out.println("mediumNumber = " + mySmallNumber);
        System.out.println("newSmallNumber = " + newSmallNumber);

        int result = mySmallNumber + 10;

        //If/Switch - Zadanie 1
        int a = 10;
        checkNumber(-10);
        checkNumber(0);
        checkNumber(5);
        checkNumber(55);
        checkNumber(106);
        checkNumber(1001);
        checkNumber(10_000_000);
    }

    private static void checkNumber(int a) {
        System.out.println("Numer: " + a);
        if(a <= 0) {
            System.out.println("mniejsze lub równe 0");
        } else if(a <= 10) {
            System.out.println("przedzial 1-10");
        } else if(a <= 100) {
            System.out.println("przedzial 11-100");
        } else if(a <= 1000) {
            System.out.println("przedzial 101-1000");
        } else if(a <= 10000) {
            System.out.println("przedzial 1001-10000");
        } else {
            System.out.println("ponad 10000");
        }
    }
}