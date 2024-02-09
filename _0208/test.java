package _0208;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("hi");
        list.add(1004);
        list.add(5.5);
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}