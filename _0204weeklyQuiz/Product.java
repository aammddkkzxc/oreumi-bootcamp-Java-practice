package _0204weeklyQuiz;

public abstract class Product implements DeliveryChargeCalculator {
    String name;
    int weight;
    int price;

    public Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int getDeliveryCharge() {
        int charge = calculateChargeWithWeight();
        if (price < 30000) {
            return charge;
        }
        if (price < 1000000) {
            return charge - 1000;
        }
        return 0;
    }

    private int calculateChargeWithWeight() {
        if (weight < 3) {
            return 1000;
        }
        if (weight < 10) {
            return 5000;
        }
        return 10000;
    }
}
