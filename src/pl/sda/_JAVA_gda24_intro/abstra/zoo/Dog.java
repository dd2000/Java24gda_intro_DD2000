package pl.sda._JAVA_gda24_intro.abstra.zoo;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public String getVoice() {
        return "Hau, Hau!";
    }
}