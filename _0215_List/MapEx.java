package _0215_List;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("키", 1);
        hashMap.put("키키", 2);
        hashMap.put("키키키", 5);
        System.out.println(hashMap);


        boolean isContain = hashMap.containsKey("키");
        System.out.println("isContain" + isContain);
        boolean isKey = hashMap.containsValue(5);
        System.out.println("isKey" + isContain);

        System.out.println(hashMap.keySet());

        Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
