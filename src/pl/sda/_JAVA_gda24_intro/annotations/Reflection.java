package pl.sda._JAVA_gda24_intro.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) {
        String string = "";

        Class stringClass = string.getClass();

        Field[] declaredFields = stringClass.getDeclaredFields();
        System.out.println("String fields: ");
        Arrays.stream(declaredFields).forEach(field -> System.out.println(field.getName()));

        System.out.println("===");

        Method[] declaredMethods = stringClass.getDeclaredMethods();
        System.out.println("String methods: ");
        Arrays.stream(declaredMethods).forEach(method -> System.out.println(method.getName()));
    }
}
