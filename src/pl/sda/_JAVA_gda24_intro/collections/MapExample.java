package pl.sda._JAVA_gda24_intro.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // z lewej strony zawsze podajemy typ ogolny mapy
        // nastepnie w nawiasach ostrych <> typ danych jaki bedzie przetrzymywala nasza mapa
        // z prawej strony rownania wybieramy konkretna implementacje mapy
        Map<CarBrand, Car> cars = new HashMap<>();

        CarBrand tesla = new CarBrand("Tesla");
        Car teslaModelS = new Car("Model S");

        CarBrand toyota = new CarBrand("Toyota");
        Car toyotaRav4 = new Car("RAV 4");

        CarBrand renault = new CarBrand("Renault");
        Car megane = new Car("Megane");

        cars.put(tesla, teslaModelS);
        cars.put(toyota, toyotaRav4);
        cars.put(renault, megane);

        // wielkosc mapy, to ilosc kluczy
        System.out.println("Map size: " + cars.size());

        // iteracja po kluczach
        Set<CarBrand> carBrands = cars.keySet();
        System.out.println("\nPrinting all keys in map >>>");
        for (CarBrand brand : carBrands) {
            System.out.println(brand);
        }

        // iteracja po wartosciach
        System.out.println("\nPrinting all values in map >>>");
        Collection<Car> values = cars.values();
        for (Car car : values) {
            System.out.println(car);
        }

        // iteracja zarowno po kluczu jak i wartosci
        System.out.println("\nPrinting key -> value >>>");
        Set<Map.Entry<CarBrand, Car>> entries = cars.entrySet();
        for (Map.Entry<CarBrand, Car> entry : entries) {
            CarBrand carBrand = entry.getKey();
            Car car = entry.getValue();
            System.out.println(carBrand + " -> " + car);
        }
    }
}
