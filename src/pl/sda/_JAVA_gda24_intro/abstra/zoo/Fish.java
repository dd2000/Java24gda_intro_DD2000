package pl.sda._JAVA_gda24_intro.abstra.zoo;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.FISH;
    }

    @Override
    public String getVoice() {
        return "Bul, bul!";
    }
}