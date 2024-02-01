package _0201inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("현대", 100, 4);
        car.print();
        car.setParentSpeed();
        car.print();
        car.setChildSpeed();
        car.print();
    }
}
