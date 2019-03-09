package pl.sda.t03_d1sob1_abstrakcyjne_kl_met.ToolsShop;

public class Hammer extends Tool {
    private double masa;

    //konstruktor
    public Hammer(String model, double price, double masa) {
        super(model,price);
        this.masa = masa;

    } //konstruktor Hammer
}  // class Hammer
