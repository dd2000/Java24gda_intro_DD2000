package pl.sda.t02_d2niedz_enums_arrays.n1_enums;

/*
    Utwórz enum Operation, dla którego występować będą wartości: PLUS, MINUS, MULTIPLY, DIVIDE.
    Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.,
    a do Operation reprezentację tekstową: "+", "-" itp

    Dodaj do enum Operation metodę calculate(double a, double b),
    która dla dwóch podanych liczb wykona odpowiednią operację matematyczną
    oraz wyświetli jej wywołanie w "ładny" sposób na konsoli.
    Zadbaj o przykład użycia i wykonanie kilku operacji matematycznych.


*/


public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    // konstruktor enuma !!!!
    Operation(String symbol) {
        this.symbol = symbol;
    }  // konstruktor Operation


    // metoda calculate wykonujaca działania
    public double calculate(double a, double b){
        double result = 0.0;
        switch (this) {  // wartość enuma, do której sie odwołujemy w miejscu użycia w kodzie main
            case PLUS:
                    result =  (a + b);
                    break;
            case MINUS:
                    result =  (a - b);
                    break;
            case MULTIPLY:
                    result =  (a * b);
                    break;
            case DIVIDE:
                    result =  (a / b);
                    break;
        } // switch

        return result;
    }  // metoda calkulate

} //Operation enum
