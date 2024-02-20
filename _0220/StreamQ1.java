package _0220;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamQ1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5);
        list.stream().distinct().forEach(System.out::println);


        List<String> stringList = list.stream().distinct().map(Objects::toString).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
