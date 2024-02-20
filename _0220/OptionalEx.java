package _0220;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> nullableOpt = Optional.ofNullable(null);
        String answer = nullableOpt.orElse("꽝");

        System.out.println(answer);

        Optional<List<String>> optionalList = Optional.ofNullable(null);
        List<String> stringList = optionalList.orElseGet(ArrayList::new);
        System.out.println(stringList.isEmpty());

        optionalList.orElseThrow(IllegalArgumentException::new);
    }
}
