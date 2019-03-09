package pl.sda.t03_d1sob1_abstrakcyjne_kl_met;

//    Utwórz klasę Tool, która będzie reprezentować narzędzia do kupienia w sklepie.
//    Każde narzędzie powinno mieć swój model i cenę.
//    Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
//    Klasa Hammer powinna mieć dodatkowe pole z wagą młotka, a klas Saw z długością piły.
//    Utwórz klasę ToolsShop w której utworzysz kilka narzędzi i wyświetlisz ich ceny.
//
//    Dodaj do klasy Tool metodę która zwraca opis narzędzia (model + cena).
//    Dodatkowo klasy Hammer i Saw powinny rozszerzać opis o swoje unikatowe cechy.


public class Tool {
    private String model;
    private double price; // cena
}  // class Tool

public class Hammer extends Tool {
    private double masa;
}  // class Hammer

public class Saw extends Tool {
    private double sawLength;

}  // class Saw