package _0130;


import java.util.Arrays;
import java.util.Collections;

public class IterationSample {
    public static void main(String args[]) {
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};
        double avg;
        int sum = 0;
        Arrays.sort(array);
        int max = array[array.length - 1];
        for(int number : array) {
            sum += number;
        }
        avg = (double)sum / array.length;
        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);
    }
}
