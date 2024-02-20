package _0220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class loopingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b");

        List<String> answer = list.stream().distinct().toList();
        System.out.println(answer);
    }

}
