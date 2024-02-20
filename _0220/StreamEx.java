package _0220;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 6, 7, 8, 2, 1);
        list.stream().sorted().forEach(System.out::println);
    }
}
