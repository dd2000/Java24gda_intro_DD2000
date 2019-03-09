package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._3_abstract;

public abstract class Vegatable extends Food {

    //konstruktor
    public Vegatable(String name) {
        super(name);
    }

    public enum getType() {
        return FoodType.VEGETABLE;
    } // getType()
}  // class abstr. Vegatable
