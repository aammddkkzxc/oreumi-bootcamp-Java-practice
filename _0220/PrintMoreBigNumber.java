package _0220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintMoreBigNumber {
    public List<Integer> solution(int numberInput, int[] array) {
        List<Integer> answer = new ArrayList<>();

//        for(int number : array) {
//            if (number >= numberInput) {
//                answer.add(number);
//            }
//        }
//
//        List<Integer> answer = Arrays.stream(array).filter(n -> n >= numberInput).boxed().collect(Collectors.toList());



        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
