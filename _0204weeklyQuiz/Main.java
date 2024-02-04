package _0204weeklyQuiz;

import _0204weeklyQuiz.ProductType.Beauty;

public class Main {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("마스카라", 100, 10000, true);
        System.out.println(beauty.getDeliveryCharge());
    }
}
