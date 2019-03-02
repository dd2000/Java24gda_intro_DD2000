package pl.sda._JAVA_gda24_intro.generics.exercises;

import java.util.Collection;

public class Utils {

    /**
     * Ta metoda nie ma ograniczeń co do typów danych, które może przyjąć
     */
    public static <T> int countOccurrence(Collection<T> collection, T elementToSearch) {
        int count = 0;
        for (T element : collection) {
            if (element.equals(elementToSearch)) {
                ++count;
            }
        }
        return count;
    }

    /**
     * Jeżeli chcemy ograniczyć możliwe typy danych jakie może przyjąć metode należy zastosować: <T extends CLASS/INTERFACE>
     */
    public static <T extends Number> T maxNumber(Collection<T> numbers) {
        if(numbers == null || numbers.isEmpty()) {
            return null;
        }

        T max = null;
        for (T number : numbers){
            if(max == null || max.doubleValue() < number.doubleValue()) {
                max = number;
            }
        }

        return max;
    }

    /**
     * Ta metoda nie ma ograniczeń co do typów danych, znak ? (wildcard) oznacza dowolny typ generyczny
     */
    public static int sizeOfNotNull(Collection<?> collection) {
        if(collection == null || collection.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Object element : collection) {
            if (element != null) {
                ++count;
            }
        }
        return count;
    }

    /**
     * Ograniczamy możliwe parametry do kolekcji zawierającej obiekty klasy Number lub klasy dziedziczących po Number
     */
    public static double sumNumbers(Collection<? extends Number> collection) {
        if(collection == null || collection.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Number element : collection) {
            if (element != null) {
                sum+= element.doubleValue();
            }
        }
        return sum;
    }
}
