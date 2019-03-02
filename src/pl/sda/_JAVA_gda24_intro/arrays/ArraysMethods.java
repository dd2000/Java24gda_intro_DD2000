package pl.sda._JAVA_gda24_intro.arrays;

public class ArraysMethods {

    public void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }

    public void printArrayBasedOnVarargs(String... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            System.out.println(varargs[i]);
        }

        for (String s : varargs) {
            System.out.println(s);
        }
    }

}
