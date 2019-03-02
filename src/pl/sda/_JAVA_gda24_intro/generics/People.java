package pl.sda._JAVA_gda24_intro.generics;

public class People<K extends Person, V> {
    private final K k;
    private final V v;

    public People(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }
}
