package learn_generic.forth_example;

public interface Findable<T, V> {
    T find(V key);
}
