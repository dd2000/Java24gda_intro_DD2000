package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._2_ToolsShop;

public class Saw extends Tool {
    private double sawLength;  // długość piły

    public Saw(String model, double price, double sawLength) {
        super(model, price);
        this.sawLength = sawLength;
    }
}  // class Saw