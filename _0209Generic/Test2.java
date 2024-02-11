package _0209Generic;

import java.util.ArrayList;
import java.util.List;

public class Test2<E> {
    public List<E> list = new ArrayList<>();

    public void produce(Product<? extends E> product) {
        for(E e : product.getItem()) {
            list.add(e);
        }
        System.out.println(list);
    }
}
