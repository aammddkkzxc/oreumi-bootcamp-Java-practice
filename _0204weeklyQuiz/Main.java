package _0204weeklyQuiz;

import _0204weeklyQuiz.ProductType.Beauty;
import _0204weeklyQuiz.ProductType.Grocery;
import _0204weeklyQuiz.ProductType.LargeAppliance;

public class Main {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

        int totalPromotion = beauty.getDiscountAmount() + grocery.getDiscountAmount() + largeAppliance.getDiscountAmount();

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = 0;
        for(Product product : cart.getProducts()) {
            totalDeliveryCharge += cart.calculateDeliveryCharge(product);
        }

        System.out.println(totalDeliveryCharge - totalPromotion);    // 결과: 9000
    }
}
