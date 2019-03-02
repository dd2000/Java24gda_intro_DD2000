package pl.sda._JAVA_gda24_intro.functional.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Samples {
    public static void main(String[] args) {
        //#1
        //tworzenie i wykorzystywanie obiektów klasy Optional
        //optionals();

        //#2
        //tworzenie i wykorzystywanie Lambd
        //lambdas();

        //#3
        //przegląd źródeł dla strumieni danych
        //streamsSources();

        //#4
        //przegląd strumieni i ich przekształceń
        //streams();
    }

    private static void optionals() {
        Integer number = 10;
        Optional<Integer> optional = Optional.ofNullable(number);
        System.out.println("optional = " + optional);
        System.out.println("optional.isPresent() = " + optional.isPresent());
        System.out.println("optional.get() = " + optional.get());
        System.out.println("optional.orElse() = " + optional.orElse(-1));

        System.out.println();

        Optional<Integer> emptyOptional = Optional.empty();
        System.out.println("emptyOptional = " + emptyOptional);
        System.out.println("emptyOptional.isPresent() = " + emptyOptional.isPresent());
        //wyrzuca wyjątek
        //System.out.println("emptyOptional.get() = " + emptyOptional.get());
        System.out.println("emptyOptional.orElse() = " + emptyOptional.orElse(-1));

        //użycie jako wartość zwracaną przez metodę
        Optional<String> stringOptional = createString();
        if (stringOptional.isPresent()) {
            System.out.println("stringOptional = " + stringOptional.get());
        }
        //to samo co wyżej ale z użyciem Lambdy
        stringOptional.ifPresent(s -> System.out.println("stringOptional 2 = " + s));

        //jak brak wyrzucamy własny wyjątek
        stringOptional.orElseThrow(() -> new RuntimeException("String is Empty"));
    }

    private static Optional<String> createString() {
        return Optional.of("123");
    }

    private static void lambdas() {
        //**********
        // Function
        Function<Integer, String> intToStr = (Integer number) -> {
            return "Moja liczba: " + String.valueOf(number);
        };
        System.out.println("intToStr.apply(103) = " + intToStr.apply(103));

        //to samo co wyżej tylko krócej - wyrażenie lambda
        Function<Integer, String> intToStr2 = (number) -> String.valueOf(number);
        System.out.println("intToStr2.apply(44) = " + intToStr2.apply(44));

        //to samo co wyżej tylko jeszcze krócej :) - odwołanie się do metod
        Function<Integer, String> intToStr3 = String::valueOf;
        System.out.println("intToStr3.apply(44) = " + intToStr3.apply(13));

        //**********
        // Supplier
        Supplier<Integer> integerSupplier1 = () -> {
            return 10;
        };
        System.out.println("integerSupplier1.get() = " + integerSupplier1.get());

        //to samo co wyżej tylko krócej
        Supplier<Integer> integerSupplier2 = () -> 15;
        System.out.println("integerSupplier2.get() = " + integerSupplier2.get());

        //**********
        // Predicate
        Predicate<String> predicateStr = (str) -> str.length() > 0;
        System.out.println("predicateStr.test() = " + predicateStr.test("Ala"));

        //**********
        // BiConsumer
        BiConsumer<String, String> biConsumer = (name, nickname) -> System.out.printf("Ksywka dla %s to %s%n", name, nickname);
        Map<String, String> nickNames = new HashMap<>();
        nickNames.put("Adam", "Adaś");
        nickNames.put("Marcin", "Cinek");
        nickNames.put("Jarosław", "Jaro");

        //nickNames.forEach(biConsumer);
        nickNames.forEach((name, nickname) -> System.out.printf("Ksywka dla %s to %s%n", name, nickname));

        //**********
        // Własny interface
        Checker personChecker = (person) -> person != null && person.getName() != null;
        System.out.println("personChecker.test() = " + personChecker.checkIt(new Person(0, "Jarek")));
    }

    private static void streamsSources() {
        //**********
        // Kolekcje
        List<String> names = Arrays.asList("Marcin", "Łukasz", "Marta", "Adam", "Ewa");
        Stream<String> stream = names.stream();
        stream.forEach(name -> {
            String message = "Imię: " + name;
            System.out.println(message);
        });

        Set<String> animals = new HashSet<>();
        animals.add("pies");
        animals.add("kot");
        animals.add("rybka");
        animals.stream().forEach(System.out::println);

        System.out.println("------------------------");
        //**********
        // Klasa Stream
        Stream<Person> persons = Stream.of(new Person(20, "Ania"), new Person(31, "Łukasz"), new Person(24, "Feliks"), new Person(8, "Paweł"));
        persons.forEach(System.out::println);

        System.out.println("------------------------");
        //**********
        // klasa Files z Java NIO2
        try (Stream<Path> pathStream = Files.list(Paths.get("/"))) {
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------");
        try (Stream<Path> pathStream = Files.walk(Paths.get("C:\\workspace\\io_test"), 3)) {
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------");
        try (Stream<String> lines = Files.lines(Paths.get("C:\\workspace\\io_test\\A.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------");
        //**********
        // strumienie danych dla typów prymitywnych
        DoubleStream doubleStream = DoubleStream.of(1.5, 6.8, 7.1, .07);
        doubleStream.forEach(System.out::println);

        System.out.println("------------------------");
        IntStream.range(1, 20)
                .forEach(System.out::println);

        System.out.println("------------------------");
        //**********
        // klasa Random
        DoubleStream doubles = new Random().doubles(10, 4.1, 6.5);
        doubles.forEach(System.out::println);
    }

    private static void streams() {
        //map, filter, sorter - operacje pośrednie - może ich być wiele
        //collect - operacja terminalna - kończy przetwarzanie strumienia - może być tylko jedna
        List<String> names = Arrays.asList("Marcin", "Łukasz", "Marta", "Adam", "Ewa", "Adam");
        List<String> listOfNames = names.stream()
                .map(name -> name.substring(0, 3))
                .filter(name -> !name.startsWith("Ł"))
                .sorted()
                .collect(Collectors.toList());

        for (String name : listOfNames) {
            System.out.println(name);
        }

        System.out.println("------------------------");
        String joinedNames = names.stream()
                .distinct()
                .collect(Collectors.joining(" "));

        System.out.println(joinedNames);

        System.out.println("------------------------");
        OptionalInt firstEvenNumber = IntStream.range(10, 20)
                .limit(5)
                .filter(number -> number % 2 == 0)
                .findFirst();

        firstEvenNumber.ifPresent(System.out::println);

        System.out.println("------------------------");
        OptionalDouble max = DoubleStream.of(10.2, 1.1, 0.4, 8, 9.4)
                .map(number -> number + 10)
                .reduce((left, right) -> {
                    if (left > right) {
                        return left;
                    }
                    return right;
                });

        System.out.println("max = " + max.getAsDouble());
    }
}

@FunctionalInterface
interface Checker {
    boolean checkIt(Person student);
}