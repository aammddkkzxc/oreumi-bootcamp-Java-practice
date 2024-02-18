package _0216;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> chart = new HashMap<>();

        chart.put("김부장", 100);
        chart.put("정대리", 65);
        chart.put("권사원", 50);
        chart.put("송과장", 80);
        chart.replace("정대리", 75);
        System.out.println("총 Entry 수: " + chart.size());    // 저장된 총 Entry 수 얻기

        // 2. 객체 찾기
        System.out.println(chart.get("송과장"));
        System.out.println();

        // 3. 객체를 하나씩 처리
        Set<String> keySet = chart.keySet();
        for (String key : keySet) {
            Integer value = chart.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println();

        // 4. 객체 삭제
        chart.remove("김부장");
        System.out.println("총 Entry 수: " + chart.size());

        // 5. 객체를 하나씩 처리
        Set<Entry<String, Integer>> entrySet = chart.entrySet(); // Map.EntrySet 얻기
        for (Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        chart.clear();
        System.out.println(chart.size());
    }
}
