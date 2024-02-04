package _0204weeklyQuiz;

import _0204weeklyQuiz.ProductType.Beauty;
import _0204weeklyQuiz.ProductType.Grocery;
import _0204weeklyQuiz.ProductType.LargeAppliance;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product beauty = new Beauty("마스카라", 10, 10000, true);
        Product grocery = new Grocery("깻잎", 1, 3000, 1);
        Product largeAppliance = new LargeAppliance("냉장고", 500, 1000000, 900);

        List<Product> products = new ArrayList<>();
        products.add(beauty);
        products.add(grocery);
        products.add(largeAppliance);

        for(Product product : products) {
            System.out.println(product.getDeliveryCharge());
        }
    }
}
