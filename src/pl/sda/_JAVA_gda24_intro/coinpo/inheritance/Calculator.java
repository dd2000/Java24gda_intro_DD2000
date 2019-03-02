package pl.sda._JAVA_gda24_intro.coinpo.inheritance;

public class Calculator {
    private int sum;

    public Calculator() {
       sum = 1 + 2;
    }

    public Calculator(int n1) {
       this();
       sum += n1;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "sum=" + sum +
                '}';
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1);

        Calculator c2 = new Calculator(3);
        System.out.println(c2);
    }
}
