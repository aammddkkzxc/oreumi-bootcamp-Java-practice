package _0221;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.empty();


        // 값이 있는지 확인하지 않고 바로 접근 시도
        String value = optionalString.get(); // NoSuchElementException 발생
    }
}
