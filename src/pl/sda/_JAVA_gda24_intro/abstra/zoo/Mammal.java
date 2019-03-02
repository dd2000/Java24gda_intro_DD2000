package pl.sda._JAVA_gda24_intro.abstra.zoo;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.MAMMAL;
    }
}