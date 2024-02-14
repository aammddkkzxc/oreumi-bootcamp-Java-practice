package _0214_Generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        int intValue = box1.getBox();

        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getBox();

        System.out.println(intValue + strValue);
    }
}
