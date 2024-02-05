package _0204weeklyQuiz;

public class Cart {
    private final Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int price = calculateChargeWithTotalPrice();
        int charge = calculateChargeWithTotalWeight();

        if (price < 30000) {
            return charge;
        }
        if (price < 100000) {
            return charge - 1000;
        }
        return 0;
    }

    private int calculateChargeWithTotalWeight() {
        int totalWeight = 0;
        for(Product product : products) {
            totalWeight += product.getWeight();
        }

        if (totalWeight < 3) {
            return 1000;
        }
        if (totalWeight < 10) {
            return 5000;
        }
        return 10000;
    }

    private int calculateChargeWithTotalPrice() {
        int finalPrice = 0;

        for(Product product : products) {
            finalPrice += product.getPrice();
            finalPrice -= product.getDiscountAmount();
        }

        return finalPrice;
    }

    public Product[] getProducts() {
        return products;
    }
}
