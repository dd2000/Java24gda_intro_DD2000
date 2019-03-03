package pl.sda.t02_d2niedz.n1_enums;

/*
    a) Utwórz enum Currency, który ma reprezentować walutę.
      Ograniczmy się do 5 walut: polski złoty, dolar, euro, jen, funt brytyjski.
    b) Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp., a do Operation reprezentację tekstową: "+", "-" itp
    c) Do enum Currency dodaj pole oznaczające kurs waluty (w stosunku do polskiego złotego)
       oraz metodę która wyliczy wartość podanej kwoty w obcej walucie (np.: 100 zł -> 30 euro)
    d) (*) Zadbaj by można było na bazie reprezentacji tekstowej ("PLN",  "+" itp)
       znaleźć odpowiednią wartość enum Currency i Operation.
    e) (*) * Stwórz klasę Money zawierającą dwa pola: currency i value.
        Nadpisz metodę do tworzenia wartości tekstowej (toString()) tak,
        żeby wyświetlała wartość z symbolem waluty, np. 40 EURO.
        Dodaj metodę exchange(Currency currency), która zwróci nowy obiekt Money w nowej walucie
        dla aktualnej wartości.
*/


public enum Currency {


    // wartości enuma `Colors`
    PLN("zł", 1.00),
    USD("$", 3.70),
    EUR("€", 3.28),
    JEN("J", 0.20),
    GBF("F",4.99);

    private String symbol;
    private double kurs;

    // konstruktor enuma !!!!
    Currency(String symbol, double kurs) {
        this.symbol = symbol;
        this.kurs = kurs;
    }

} // Currency enum
