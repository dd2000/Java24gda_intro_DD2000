package pl.sda.t02_d2niedz_enums_arrays.arrays;

public class Varargs {

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
//        // none params
        varargs.getNumbers();
        // one param
        varargs.getNumbers(3);
        // many params
        varargs.getNumbers(4, 6, 7, 10, 102);

//        varargs.getNumbersAsStrings("1", "2", "3");
//
//        // varargs as the last one
//        varargs.getNumbers("secret codes", 5, 7, 14, 44, 567);
//
//        // varargs as the last one
        varargs.pickOne("The best coder is: ", 1);
        varargs.pickOne("The best coder is: ", 3, "Marek", "Ania", "Robert", "Zuzanna");
//        varargs.pickOne("The worst coder is: ", 10, "Marek", "Ania", "Robert", "Zuzanna");
    }

    private void getNumbers(int... numbers) {
        System.out.print("Got numbers: ");
        if (numbers.length > 0) {
            System.out.println(numbers[0]);
        }
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private void getNumbersAsStrings(String... numbers) {
        String[] arr = numbers;
        System.out.print("Got numbers: ");
        for (String number : arr) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private void getNumbers(String label, double... numbers) {
        System.out.print("Got " + label + ": ");
        for (double number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private void pickOne(String label, int index, String... names) {
        if (names.length > index) {
            System.out.println(label + names[index]);
            return;
        }

        System.out.println("There is no element of index: " + index);
    }
}
