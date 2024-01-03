package generics;

import java.util.Objects;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair() {

    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> odd = (Pair<?, ?>) o;
        return Objects.equals(key, odd.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
