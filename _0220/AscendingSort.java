package _0220;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

//        for(int i = 0; i < result.length; i++) {
//            if (i < array1.length) {
//                result[i] = array1[i];
//            }
//            else {
//                result[i] = array2[i - array1.length];
//            }
//        }
//        Arrays.sort(result);
//        return result;

        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted()
                .toArray();
    }


    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
//        List<Integer> list = new ArrayList<>();
//
//        OptionalDouble average = list.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//
//        average.ifPresent(System.out::println);
    }
}
