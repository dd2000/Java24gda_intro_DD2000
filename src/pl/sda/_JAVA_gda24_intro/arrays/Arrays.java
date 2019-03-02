package pl.sda._JAVA_gda24_intro.arrays;

public class Arrays {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.declareAndInit();


//        arrays.tablesAsReferences();
//        arrays.castToDouble(new int[]{1, 2, 3});
//
//        String[] names = {"ania", "łukasz", "maciek"};
//        printStringArray(names);
//        arrays.updateTable(names);
//        printStringArray(names);
//
//        arrays.printTwoDimensionalArray(new double[][]{{1.4, 5.6, 6.1}, {7, 9.2}});
    }

    private void declareAndInit() {
        int[] arrayOfNumbers = {1, 5, 8, 31};
        System.out.println("arrayOfNumbers.length = " + arrayOfNumbers.length);
        System.out.println("arrayOfNumbers[0] = " + arrayOfNumbers[0]);
        System.out.println("arrayOfNumbers[3] = " + arrayOfNumbers[3]);

        arrayOfNumbers = new int[]{1, 5};
        System.out.println("arrayOfNumbers.length = " + arrayOfNumbers.length);
        System.out.println("arrayOfNumbers[0] = " + arrayOfNumbers[0]);
        System.out.println("arrayOfNumbers[1] = " + arrayOfNumbers[1]);

        int[] emptyArray = new int[4];
        System.out.println("emptyArray.length = " + emptyArray.length);
        System.out.println("emptyArray[0] = " + emptyArray[0]);
        System.out.println("emptyArray[3] = " + emptyArray[3]);

        String[] emptyStringArry = new String[10];
        System.out.println("emptyStringArry.length = " + emptyStringArry.length);
        System.out.println("emptyStringArry[0] = " + emptyStringArry[0]);
        System.out.println("emptyStringArry[last] = " + emptyStringArry[emptyStringArry.length - 1]);
    }

    private void tablesAsReferences() {
        byte[] b1 = {1, 2, 3};
        byte[] b2 = {1, 2, 3, 5, 5};
        byte[] b = b2;

        b2 = b1;
        b2[0] = 77;
        b[0] = 99;

        System.out.print("\nArray b1:");
        for (byte a : b1) {
            System.out.print(" " + a);
        }

        System.out.print("\nArray b2:");
        for (byte a : b2) {
            System.out.print(" " + a);
        }

        System.out.print("\nArray a2:");
        for (byte a : b) {
            System.out.print(" " + a);
        }
    }

    private void castToDouble(int[] ints) {
        double[] doubles = new double[ints.length];
        for (int i = 0; i < ints.length; i++) {
            doubles[i] = ints[i];
        }

        printArray(doubles);
    }

    private static void printStringArray(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    private void updateTable(String[] names) {
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
    }

    private void printTwoDimensionalArray(double[][] prices) {
        for (double[] price : prices) {
            for (double aPrice : price) {
                System.out.print(aPrice + ", ");
            }
            System.out.println();
        }
    }

    private void printArray(double[] numbers) {
        for (double number : numbers) {
            System.out.print(number + ", ");
        }
    }
}