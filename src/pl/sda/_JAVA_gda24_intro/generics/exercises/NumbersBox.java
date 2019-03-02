package pl.sda._JAVA_gda24_intro.generics.exercises;

import java.util.List;

public class NumbersBox<T extends Number> {

    private List<T> numbers;

    public NumbersBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public boolean isEmpty() {
        return numbers == null || numbers.isEmpty();
    }

    public T getFirstNumber() {
        if(isEmpty()) {
            return null;
        }

        return numbers.get(0);
    }

    public int getFirstNumberAsInt() {
        Number firstNumber = getFirstNumber();
        if(firstNumber == null) {
            return 0;
        }

        return firstNumber.intValue();
    }

    public T getLastNumber() {
        if(isEmpty()) {
            return null;
        }

        return numbers.get(numbers.size() - 1);
    }

    public int getLastNumberAsInt() {
        Number lastNumber = getLastNumber();
        if(lastNumber == null) {
            return 0;
        }

        return lastNumber.intValue();
    }
}