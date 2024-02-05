package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class Beauty extends Product {
    public Beauty(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
