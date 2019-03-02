package pl.sda._JAVA_gda24_intro.statements;

public class LiveCoding {
    public static void main(String[] args) {
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