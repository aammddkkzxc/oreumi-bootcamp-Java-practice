package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class Grocery extends Product {
    public Grocery(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}
