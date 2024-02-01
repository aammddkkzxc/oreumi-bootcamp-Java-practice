package _0201;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        // 잘못된 속도 변경
        car.setSpeed(-50);
        System.out.println("현재 속도: " + car.getSpeed());

        // 올바른 속도 변경
        car.setSpeed(60);
        System.out.println("변경 후 속도: " + car.getSpeed());

        // 멈춤
        car.setStop(true);
        car.isStop();

        System.out.println("멈춤 후 속도: " + car.getSpeed());
    }
}
