package pl.sda._JAVA_gda24_intro.generics;

import java.util.ArrayList;
import java.util.List;

public class ErrorExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List objects = stringList;
        objects.add(new Object());

        Object o = objects.get(0);
        String s = (String) objects.get(0);
    }
}
