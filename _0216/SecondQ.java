package _0216;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondQ {
    public static void main(String[] args) {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> list = Arrays.asList(3, 3, 5, 8, 2, 2);

        for (Integer number : list) {
            result.put(number, result.getOrDefault(number, 0) + 1);
        }

        System.out.println(result);
    }
}
