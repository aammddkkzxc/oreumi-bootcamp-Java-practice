package _0205Vehicle;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);
    }
}
