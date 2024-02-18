package _0215_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        String string1 = "1";
        String string2 = "1";
        boolean s = string1.equals(string2);
        stringSet.add("요소1");
        stringSet.add("요소");
        stringSet.add("요소3");
        System.out.println(stringSet);

        for(String string : stringSet) {
            stringSet.remove(string);
        }
    }
}


