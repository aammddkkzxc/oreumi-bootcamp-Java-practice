package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, int weight, int price) {
        super(name, weight, price);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
