package _0204weeklyQuiz;

import _0204weeklyQuiz.ProductType.Beauty;
import _0204weeklyQuiz.ProductType.Grocery;
import _0204weeklyQuiz.ProductType.LargeAppliance;

public class Main {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 2, 30000);
        Product grocery = new Grocery("grocery", 3, 20000);
        Product largeAppliance = new LargeAppliance("largeAppliance", 5, 50000);

//        int totalPromotion = beauty.getDiscountAmount() + grocery.getDiscountAmount() + largeAppliance.getDiscountAmount();

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateTotalDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }
}
