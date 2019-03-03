package pl.sda.t02_d2niedz.n1_enums;

public class CurrencyOperationTEST {

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(3.3,1.1));
        System.out.println(Operation.MINUS.calculate(3.3,1.1));
        System.out.println(Operation.MULTIPLY.calculate(3.3,1.1));
        System.out.println(Operation.DIVIDE.calculate(3.3,1.1));

    }  //main
} // CurrencyOperationTEST
