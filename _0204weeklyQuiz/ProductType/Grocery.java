package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class Grocery extends Product {
    int storageDays;

    public Grocery(String name, int weight, int price, int storageDays) {
        super(name, weight, price);
        this.storageDays = storageDays;
    }

    @Override
    public int getDeliveryCharge() {
        if (storageDays > 2) {
            return 0;
        }
        return super.getDeliveryCharge();
    }
}
