package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._3_abstract;

public abstract class Meat extends Food {
    //konstruktor
    public Meat(String name) {
        super(name);
    }

    public FoodType getType(){
        return FoodType.MEAT;
    } // getType()
} // clas abstr. Meat
