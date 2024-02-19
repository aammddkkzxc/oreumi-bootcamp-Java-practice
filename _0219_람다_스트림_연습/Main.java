package _0219_람다_스트림_연습;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args) {
        Supplier<String> s = () -> "안녕";
        System.out.println(s.get());

        Consumer<Integer> c = System.out::println;
        c.accept(3);

        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("8"));

        LongSupplier longSupplier = () -> 500;
        System.out.println(longSupplier.getAsLong());

        ToIntBiFunction<String, String> toIntBiFunction1 = (a, b) -> a.compareToIgnoreCase(b);
        System.out.println(toIntBiFunction1.applyAsInt("java8", "JAVA8"));

        ToIntBiFunction<String, String> toIntBiFunction2 = String::compareToIgnoreCase;
        System.out.println(toIntBiFunction2.applyAsInt("java8", "JAVA8"));

        Function<String, Member> memberFunction1 = Member::new;
        Member member1 = memberFunction1.apply("나미야");

        BiFunction<String, String, Member> memberBiFunction2 = Member::new;
        Member member2 = memberBiFunction2.apply("나미야", "잡화점");


    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }
}