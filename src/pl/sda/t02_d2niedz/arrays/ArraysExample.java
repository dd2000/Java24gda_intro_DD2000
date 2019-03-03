package pl.sda.t02_d2niedz.arrays;

public class ArraysExample {
    public static void main(String[] args) {
//        int[] numbers; // deklaracja
//        numbers = new int[]{1, 3, 6, 9}; // inicjalizacja

//        int[] numbers = {1, 3, 6, 9}; // deklaracja i inicjalizacja

//        int[] numbers = new int[4];
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]); // wystąpienie wyjątku
//        System.out.println(numbers[-1]); // wystąpienie wyjątku

        // przypisanie wartośći poszczególnym indeksom tablicy
//        numbers[0] = 1;
//        numbers[1] = 3;
//        numbers[2] = 6;
//        numbers[3] = 9;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);

//        int[] numbers = new int[4];
//        System.out.println("Rozmiar tablicy: " + numbers.length);


//        double[][] numbers1 = new double[][]{
//                {1.1, 1.2}, {2.1, 2.2, 2.3}
//        };
//
//        System.out.println(numbers1.length);
//        System.out.println(numbers1[0].length);
//        System.out.println(numbers1[1].length);
//        System.out.println(numbers1[0][0]);
//        System.out.println(numbers1[0][1]);
////        System.out.println(numbers1[0][2]); // wyjatek
//        System.out.println(numbers1[1][0]);
//        System.out.println(numbers1[1][1]);
//        System.out.println(numbers1[1][2]);
//
//        double[][] numbers2 = new double[2][3];
//        numbers2[0][0] = 1.1;
//        numbers2[0][1] = 1.2;
//        numbers2[1][0] = 2.1;
//        numbers2[1][1] = 2.2;
//        numbers2[1][2] = 2.3;
//
//        System.out.println(numbers2.length);
//        System.out.println(numbers2[0].length);
//        System.out.println(numbers2[1].length);
//        System.out.println(numbers2[0][0]);
//        System.out.println(numbers2[0][1]);
//        System.out.println(numbers2[0][2]); // NIE MA WYJATKU! ISTNIEJE WARTOŚĆ DOMYŚLNA
//        System.out.println(numbers2[1][0]);
//        System.out.println(numbers2[1][1]);
//        System.out.println(numbers2[1][2]);


        int[] numbers = {1, 3, 6, 9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
            System.out.println(numbers[i]);
        }

        for (int i : numbers) {
//            numbers[i] = numbers[i] * numbers[i]; // tak nie robimy
            System.out.println(i);
        }
    }
}
