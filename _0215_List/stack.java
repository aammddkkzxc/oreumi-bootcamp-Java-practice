package _0215_List;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String value = scanner.nextLine();
        int answer = 0;

        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == '(') {
                stack.push('(');
            }
            if(value.charAt(i) == ')') {
                stack.pop();
                if (value.charAt(i - 1) == '(') {
                    answer += stack.size();
                }
                if (value.charAt(i - 1) == ')') {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}