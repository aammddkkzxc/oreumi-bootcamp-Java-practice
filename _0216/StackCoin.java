package _0216;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackCoin {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("십원");
        stack.push("오십원");
        stack.push("백원");
        stack.push("오백원");

        stack.peek();

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
        }
    }
}
