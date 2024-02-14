package _0214_wildcard;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
