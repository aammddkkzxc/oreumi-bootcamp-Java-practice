package _0131;

public class CarExample {
    public static void main(String[] args) {
        CarReference carReference = new CarReference(100);
        carReference.speed = 150;
        carReference.setSpeed();
        setSpeed2(carReference);
    }

    private static void setSpeed2(CarReference carReference) {
        carReference.speed = 300;
    }
}

