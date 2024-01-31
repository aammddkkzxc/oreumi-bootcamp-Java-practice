package _0131al;

import java.util.ArrayList;
import java.util.List;

public class ss {
    public static void main(String[] args) {
        System.out.println(solution(2));
    }

    public static int solution(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        getFib(fib, n);
        return fib.get(fib.size()-1) % 1234567;
    }

    private static void getFib(List<Integer> fib, int n) {
        for (int i = 2; i <= n; i++) {
            calculateFib(fib);
        }
    }

    private static void calculateFib(List<Integer> fib) {
        fib.add(fib.get(fib.size()-2) + fib.get(fib.size()-1));
    }
}
