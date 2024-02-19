package _0218;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(1);
        list.add("안녕");

        Integer.parseInt(list.get(1).toString());
    }
}
