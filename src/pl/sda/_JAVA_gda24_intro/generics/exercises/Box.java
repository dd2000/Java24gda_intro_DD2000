package pl.sda._JAVA_gda24_intro.generics.exercises;

public class Box {
    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public boolean isEmpty() {
        return object != null;
    }
}