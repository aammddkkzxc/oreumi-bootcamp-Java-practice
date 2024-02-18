package _0218;

public class Main {

    public static void main(String[] args) {
        Interface2 interface2 = (x) -> {
            System.out.println("x: " + x);
        };

        interface2.printVal(10);
        interface2.printVal(20);
    }
}
