package pl.sda._JAVA_gda24_intro.abstra;

import pl.sda._JAVA_gda24_intro.abstra.zoo.Animal;
import pl.sda._JAVA_gda24_intro.abstra.zoo.Dog;

public class ZooKeeper {

    public static void main(String[] args) {
        Animal myDog = new Dog("Reksio");
        String speech = myDog.speak();
        System.out.println(speech);
    }
}
