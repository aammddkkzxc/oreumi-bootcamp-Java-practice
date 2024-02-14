package _0214_wildcard;

public class StorageImpl<T> implements Storage<T> {
    private final T[] array;

    public StorageImpl(T[] array) {
        this.array = array;
    }


    @Override
    public void add(T item, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }
}
