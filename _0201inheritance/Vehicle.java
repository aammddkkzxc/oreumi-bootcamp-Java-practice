package _0201inheritance;

public class Vehicle {
    public String model;
    public int speed;
    public boolean stop;
    public int wheels;
    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void print() {
        System.out.println("Parent:" + model + "," + speed + "," + stop + "," + wheels);
    }

}
