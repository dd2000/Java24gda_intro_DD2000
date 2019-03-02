package pl.sda._JAVA_gda24_intro.generics.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Samples {
    public static void main(String[] args) {
        //#1
        //użycie kolekcji bez typów generycznych
        //nonGenericsList();

        //#2
        //użycie kolekcji ze standardowym typem generycznym z Java API
        //genericsList();

        //#3
        //użycie kolekcji ze własnym typem generycznym (klasa stworzona przez nas)
        //customGenericsList();

        //#4
        //użycie kolekcji ze włąsnym typem generycznym (własne interfejsy i klasy)
        //classHierarchyList();

        //#5
        //użycie klasy własnej z typem genrycznym
        //classWithGenerics();

        //#6
        //użycie klasy własnej z ograniczonym typem genrycznym
        //classWithBoundedTypeParameter();

        //#7
        //użycie metody własnej z typem genrycznym
        //genericMethod();

        //#8
        //użycie metody własnej z ograniczonym typem genrycznym
        //boundedTypeParameterMethod();

        //#9
        //użycie metody własnej z wildcard
        //wildcardMethod();

        //#10
        //użycie metody własnej z ograniczonym wildcard
        //boundedWildcardMethod();
    }

    private static void nonGenericsList() {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(6);
        numbers.add(100);

        Integer number1 = (Integer) numbers.get(1);
        System.out.println("number1 = " + number1);

        Integer number2 = (Integer) numbers.get(1);
        Integer number3 = (Integer) numbers.get(2);

        System.out.println("sum = " + (number1 + number2 + number3));
    }

    private static void genericsList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(100);

        Integer number1 = numbers.get(0);
        Integer number2 = numbers.get(1);
        Integer number3 = numbers.get(2);

        System.out.println("sum = " + (number1 + number2 + number3));
    }

    private static void customGenericsList() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("jabłko"));
        fruits.add(new Fruit("gruszka"));
        fruits.add(new Fruit("śliwka"));

        System.out.print("My fruits: ");
        for (Fruit fruit : fruits) {
            System.out.print(fruit.getName() + ", ");
        }
        System.out.println();
    }

    private static void classHierarchyList() {
        List<Plants> plants = new ArrayList<>();
        plants.add(new Fruit("jabłko"));
        plants.add(new Tree("Bartek", 450));
        plants.add(new Fruit("śliwka"));
        plants.add(new Tree("Józek", 90));

        Plants bartekAsPlant = plants.get(1);
        if(bartekAsPlant instanceof Tree) {
            Tree bartek = (Tree) bartekAsPlant;
            System.out.println("bartek.getAge() = " + bartek.getAge());
        }

        System.out.print("My plants: ");
        for (Plants plant : plants) {
            System.out.print(plant.getName() + ", ");
        }
        System.out.println();
    }

    private static void classWithGenerics() {
        Box boxWithNumber = new Box(100);
        int number = (int) boxWithNumber.get();

        //Box boxWithWrongNumber = new Box("100");
        //int notNumber = (int) boxWithWrongNumber.get();//błąd w czasie wykonania programu

        GenericBox<Integer> genericBox = new GenericBox<>(100);
        Integer boxNumber = genericBox.getValue();
        System.out.println("boxNumber = " + boxNumber);

        GenericBox<String> genericBox2 = new GenericBox<>("Liczba: 100");
        String boxString = genericBox2.getValue();
        System.out.println("boxString = " + boxString);
    }

    private static void classWithBoundedTypeParameter() {
        PlantBox<Plants> plantBox = new PlantBox<>(new Tree("Bartek", 450));
        System.out.println("plantBox.getPlantName() = " + plantBox.getPlantName());

        PlantBox<Fruit> fruitBox = new PlantBox<>(new Fruit("malina"));
        System.out.println("fruitBox.getPlantName() = " + fruitBox.getPlantName());
    }

    private static void genericMethod() {
        List<String> strings = new ArrayList<>();
        strings.add("Ala");
        strings.add("Ola");
        strings.add("Marta");
        strings.add("Ala");
        strings.add("Zofia");

        int count = Utils.countOccurrence(strings, "Ala");
        System.out.println("'Ala' count  = " + count);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(1);
        numbers.add(15);
        numbers.add(77);
        numbers.add(15);
        numbers.add(6);

        count = Utils.countOccurrence(numbers, 15);
        System.out.println("'15' count  = " + count);
    }

    private static void boundedTypeParameterMethod() {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(1);
        integers.add(1000);
        integers.add(6);

        Integer maxInteger = Utils.maxNumber(integers);
        System.out.println("maxInteger = " + maxInteger);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.4);
        doubles.add(1.1);
        doubles.add(1.6);
        doubles.add(.7);

        Double maxDouble = Utils.maxNumber(doubles);
        System.out.println("maxDouble = " + maxDouble);
    }

    private static void wildcardMethod() {
        Set<String> names = new HashSet<>();
        names.add("Adam");
        names.add(null);
        names.add("Marek");
        names.add("Marta");
        names.add(null);

        int count = Utils.sizeOfNotNull(names);
        System.out.println("Non-null names count = " + count);
    }

    private static void boundedWildcardMethod() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(15);
        numbers.add(4);

        double sum = Utils.sumNumbers(numbers);
        System.out.println("Numbers sum = " + sum);
    }
}
