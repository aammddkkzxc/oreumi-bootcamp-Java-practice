package _0214_DailyQuiz;

public class Util {
    public static <K, V> V getValue(Pair<? extends K, V> pair, K key) {
        if(pair.getKey() == key) {
            return pair.getValue();
        }

        return null;
    }
}
