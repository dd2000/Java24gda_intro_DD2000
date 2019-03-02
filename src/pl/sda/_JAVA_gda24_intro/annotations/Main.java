package pl.sda._JAVA_gda24_intro.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnnotationExample annotationExample = new AnnotationExample();
        Method[] declaredMethods = annotationExample.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            invokeAnnotatedMethod(declaredMethod, annotationExample);
        }
    }

    private static void invokeAnnotatedMethod(Method method, Object target) {
        if (method.isAnnotationPresent(Annotated.class)) {
            try {
                method.invoke(target);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
