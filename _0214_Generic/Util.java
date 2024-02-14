package _0214_Generic;

public class Util {
    public static  <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        return box;
    }
}
