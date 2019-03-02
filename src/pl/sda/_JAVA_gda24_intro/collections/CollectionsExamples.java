package pl.sda._JAVA_gda24_intro.collections;

import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {
        // # 1
//        list();

//        // #2
//        set();
//
//        // #3
        map();
//
//        // #4
//        queue();
//
//        // #5
//        arraysAndCollections();
    }

    private static void list() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("pear");
        fruitList.add("orange");
        fruitList.add("banana");

//        Iterator<String> i1 = fruitList.iterator();
//        while (i1.hasNext()) {
//            String next = i1.next();
//            System.out.println(next);
//            i1.remove();
//        }
//
//        System.out.println(fruitList.size());
//        System.out.println(fruitList.isEmpty());

        List<String> otherFruitList = new LinkedList<>();
        otherFruitList.add("strawberry");
        otherFruitList.addAll(fruitList);
        otherFruitList.add("strawberry");

//        Iterator<String> iterator2 = otherFruitList.iterator();
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }

//        for (String fruit : otherFruitList) {
//            System.out.println(fruit);
//        }

        for (int i = 0; i < otherFruitList.size(); i++) {
            System.out.println(otherFruitList.get(i));
        }

        System.out.println("Fruit list size: " + otherFruitList.size());
        System.out.println("Fruit list contains `strawberry`? - " + otherFruitList.contains("strawberry"));
        System.out.println("Fruit list, first element: " + otherFruitList.get(0));
        System.out.println("Fruit list, is empty: " + otherFruitList.isEmpty());
        System.out.println("Fruit list, index of `strawberry`: " + otherFruitList.indexOf("strawberry"));
        System.out.println("Fruit list, last index of `strawberry`: " + otherFruitList.lastIndexOf("strawberry"));
    }

    private static void set() {
        System.out.println("\n##### SET\n");

        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("apple");
        fruitSet.add("pear");
        fruitSet.add("orange");
        fruitSet.add("banana");

//        Iterator<String> iterator = fruitSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Set<String> otherFruitSet = new TreeSet<>();
        otherFruitSet.add("strawberry");
        otherFruitSet.addAll(fruitSet);
        otherFruitSet.add("strawberry");

        for (String fruit : otherFruitSet) {
            System.out.println(fruit);
        }

        System.out.println("Fruit set size: " + otherFruitSet.size());
        System.out.println("Fruit set contains `strawberry`? - " + otherFruitSet.contains("strawberry"));
        System.out.println("Fruit set, is empty: " + otherFruitSet.isEmpty());
        boolean removed = otherFruitSet.remove("strawberry");
        System.out.println(removed);
        System.out.println("Fruit set after remove one element:");
        for (String fruit : otherFruitSet) {
            System.out.println(fruit);
        }

        otherFruitSet.clear();
        System.out.println("After clear, size: " + otherFruitSet.size());
    }

    private static void map() {
        System.out.println("\n##### MAP\n");

//        // library example
//        Map<Character, String> books = new HashMap<>();
//        books.put('a', "Aaaa 123");
//        books.put('a', "Aaaa 456");
//        books.put('b', "Bbbb 123");
        Map<CarBrand, List<Car>> cars = new HashMap<>();

        CarBrand tesla = new CarBrand("TESLA");
        List<Car> teslaCars = new ArrayList<>();
        teslaCars.add(new Car("Model S"));
        teslaCars.add(new Car("Model 3"));
        teslaCars.add(new Car("Model X"));
        cars.put(tesla, teslaCars);
        CarBrand toyota = new CarBrand("TOYOTA");
        List<Car> toyotaCars = new ArrayList<>();
        toyotaCars.add(new Car("RAV4"));
        toyotaCars.add(new Car("Corolla"));
        cars.put(toyota, toyotaCars);
        cars.put(new CarBrand("RENAULT"), Collections.singletonList(new Car("Megane")));

//        System.out.println(cars.get(tesla));

        // iteracja po kluczach
//        Set<CarBrand> carBrands = cars.keySet();
//        for (CarBrand brand : carBrands) {
//            System.out.println(brand);
//        }

        // iteracja po wartosciach
//        Collection<List<Car>> values = cars.values();
//        for (List<Car> carList : values) {
//            System.out.println(carList);
//        }

        // iteracja zarowno po kluczu jak i wartosci
//        Set<Map.Entry<CarBrand, List<Car>>> entries = cars.entrySet();
//        for (Map.Entry<CarBrand, List<Car>> entry : entries) {
//            CarBrand carBrand = entry.getKey();
//            List<Car> carsList = entry.getValue();
//            System.out.println(carBrand + ": " + carsList);
//        }

//        System.out.println("Car map size: " + cars.size());
//        System.out.println("Car map isEmpty: " + cars.isEmpty());
//        System.out.println("Car map get: " + cars.get(new CarBrand("TESLA")));
//        System.out.println("Car map contains key: " + cars.containsKey(new CarBrand("TOYOTA")));
//        System.out.println("Car map contains value: " + cars.containsValue(teslaCars));

        Map<CarBrand, List<Car>> sortedCars = new TreeMap<>();
        sortedCars.putAll(cars);
        Set<Map.Entry<CarBrand, List<Car>>> entries = sortedCars.entrySet();
        for (Map.Entry<CarBrand, List<Car>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void queue() {
        System.out.println("\n##### QUEUE\n");

        Deque<Car> queue = new ArrayDeque<>();
        queue.add(new Car("Civic"));
        queue.addFirst(new Car("Auris"));
        queue.addLast(new Car("Yaris"));

        System.out.println("Car queue size: " + queue.size());
        System.out.println("Car queue isEmpty: " + queue.isEmpty());
        System.out.println("Car queue, first element: " + queue.getFirst());
        System.out.println("Car queue, first element: " + queue.element());
        System.out.println("Car queue, first element: " + queue.peek());
        System.out.println("Car queue, first element: " + queue.peekFirst());
        System.out.println("Car queue, last element: " + queue.getLast());
        System.out.println("Car queue, last element: " + queue.peekLast());
        System.out.println("Car queue, contains `Yaris`?" + queue.contains(new Car("Yaris")));

        queue.push(new Car("Focus"));
        System.out.println("Car queue size: " + queue.size());
        System.out.println(queue.pop());
        System.out.println("Car queue size: " + queue.size());

        System.out.println(queue.poll());
        System.out.println("Car queue size: " + queue.size());

        System.out.println(queue.pollFirst());
        System.out.println("Car queue size: " + queue.size());

        System.out.println(queue.pollLast());
        System.out.println("Car queue size: " + queue.size());
    }

    private static void arraysAndCollections() {
        List<String> months = Arrays.asList(
            "January",
            "February",
            "March",
            "April",
            "June",
            "July",
            "August",
            "September",
            "November",
            "October",
            "December"
        );

        List<String> monday = Collections.singletonList("Monday");
        List<String> weekdays = Collections.emptyList();

        Collections.reverse(months);
        for (String month : months) {
            System.out.println(month);
        }

        monday.add("Thuesday");

        weekdays.add(monday.get(0));
    }
}
