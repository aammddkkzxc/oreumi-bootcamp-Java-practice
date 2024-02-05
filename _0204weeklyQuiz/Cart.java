package _0204weeklyQuiz;

public class Cart {
    private final Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge(Product product) {
        int price = product.getPrice();
        int charge = calculateChargeWithWeight(product);

        if (price < 30000) {
            return charge;
        }
        if (price < 100000) {
            return charge - 1000;
        }
        return 0;
    }

    private int calculateChargeWithWeight(Product product) {
        int weight = product.getWeight();

        if (weight < 3) {
            return 1000;
        }
        if (weight < 10) {
            return 5000;
        }
        return 10000;
    }

    public Product[] getProducts() {
        return products;
    }
}
