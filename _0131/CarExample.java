package _0131;

public class CarExample {
    public static void main(String[] args) {
        Car sonata1 = new Car("hyundai", 100);
        sonata1.speed = 150;
        System.out.println(sonata1.speed);
        sonata1.setSpeed();
        System.out.println(sonata1.speed);
        setSpeed2(sonata1);
        System.out.println(sonata1.speed);
    }

    private static void setSpeed2(Car car) {
        car.speed = 300;
    }
}

