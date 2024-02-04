package _0204weeklyQuiz.ProductType;

import _0204weeklyQuiz.Product;

public class LargeAppliance extends Product {
    int volume;

    public LargeAppliance(String name, int weight, int price, int volume) {
        super(name, weight, price);
        this.volume = volume;
    }

    @Override
    public int getDeliveryCharge() {
        if (volume > 800) {
            return super.getDeliveryCharge() + 10000;
        }
        return super.getDeliveryCharge();
    }
}
