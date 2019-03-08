package pl.sda.t02_d1sob1_rozgrz_strings.s1encapsulation.task.item;

public class ItemModel {
    public String title;
    protected String description;
    private double price;

    private String getTitle() {
        return title;
    }

    private String getDescription() {
        return description;
    }

    private double getPrice() {
        return price;
    }
}
