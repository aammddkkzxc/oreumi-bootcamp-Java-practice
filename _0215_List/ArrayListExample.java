package _0215_List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> backend = new ArrayList<>();

        backend.add("html");
        backend.add("css");
        backend.add("js");
        backend.add("java");
        backend.add("spring");
        backend.add("cs");
        backend.add("codingTest");

        backend.remove("codingTest");

        String mostImportant = backend.get(3);
        boolean isPass = backend.contains("codingTest");

        System.out.println(mostImportant);
        System.out.println("합격여부" + isPass);
    }
}
