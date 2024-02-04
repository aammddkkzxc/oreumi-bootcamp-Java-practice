package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class Beauty extends Product {
    boolean member;

    public Beauty(String name, int weight, int price, boolean member) {
        super(name, weight, price);
        this.member = member;
    }

    @Override
    public int getDeliveryCharge() {
        if (member) {
            return 0;
        }
        return super.getDeliveryCharge();
    }
}
