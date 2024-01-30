package _0129;

public class Main {
    public static void main(String[] args){
        Object nullValue = null;

        String str = "lll";

//        str = nullValue.toString(); // NullPointerException 발생
//        str = String.valueOf(nullValue); // 문자열 "null"로 변환됨

        System.out.println(str);
    }
}
