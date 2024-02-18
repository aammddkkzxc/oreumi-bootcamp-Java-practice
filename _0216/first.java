package _0216;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class first {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "레드향");
        map.put(2, "사과");
        map.put(3, "바나나");
        map.put(4, "샤인머스켓");

        Set<Entry<Integer, String>> entrySet = map.entrySet();

        for (Entry<Integer, String> entry : entrySet) {
            entrySet.remove(entry);
            System.out.println("[Key]" + entry.getKey() + "[Value]" + entry.getValue());
        }
    }
}
