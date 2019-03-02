package pl.sda._JAVA_gda24_intro.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class SchoolAndStudentAnnotations {
    public static void main(String[] args) {
        School school = new School("SDA");
        Student student = new Student("Maciej", "Rzepiński", 66);
        print(school);
        print(student);
    }

    private static void print(Object object) {
        Class clazz = object.getClass();
        printInfo(getAnnotations(clazz));
        getInfoAboutMethods(clazz);
    }

    private static void printInfo(Annotation[] annotations) {
        if (0 < annotations.length) {
            for (Annotation annotation : annotations) {
                Info info = (Info) annotation;
                System.out.println(info.author());
                System.out.println(info.date());
                System.out.println(info.desc());
            }
        }
    }

    private static void getInfoAboutMethods(Class schoolClass) {
        Method[] declaredMethods = schoolClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("Method: `" + method.getName() + "`");
            printInfo(getAnnotations(method.getClass()));
        }
    }

    private static Annotation[] getAnnotations(Class clazz) {
        return clazz.getAnnotations();
    }
}
