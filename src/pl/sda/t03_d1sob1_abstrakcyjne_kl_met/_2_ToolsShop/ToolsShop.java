package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._2_ToolsShop;

    // Utwórz klasę _2_ToolsShop w której utworzysz kilka narzędzi i wyświetlisz ich ceny.

public class ToolsShop {
    public static void main(String[] args) {
        Hammer mlot1 = new Hammer("M101",20.0, 0.2);
        Hammer mlot2 = new Hammer("M102",22.0, 0.3);
        Hammer mlot3 = new Hammer("M103",23.5, 0.4);
        Hammer mlot4 = new Hammer("M104",24.0, 0.5);
        Saw pil1 = new Saw("Piła L1", 35.1,300);
        Saw pil2 = new Saw("Piła L2", 35.2,350);
        Saw pil3 = new Saw("Piła L3", 35.3,400);
        Saw pil4 = new Saw("Piła L4", 35.4,500);

        Tool[] items = {mlot1,mlot2,mlot3,mlot4,pil1,pil2,pil3,pil4};
        for (Tool pozycja:items) {
            pozycja.printOpis();
        }  //for each
    }

} // class _2_ToolsShop
