package _0218_weekelyQuiz;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public boolean sol() {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) == '(') {
                stack.push('(');
            }
            if (stringInput.charAt(i) == ')' && stack.isEmpty()) {
                return false;
            }
            if (stringInput.charAt(i) == ')') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
