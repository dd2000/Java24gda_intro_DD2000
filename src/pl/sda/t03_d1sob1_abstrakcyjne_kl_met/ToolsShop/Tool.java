package pl.sda.t03_d1sob1_abstrakcyjne_kl_met.ToolsShop;

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

    // konstruktor
    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printOpis() {
        System.out.println("Tool: model: "+this.model+" cena: "+this.price);
    }
}  // class Tool


