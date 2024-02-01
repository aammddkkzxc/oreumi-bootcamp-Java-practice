package _0201inheritance;

public class Car extends Vehicle{
    public Car(String model, int speed, int wheels) {
        super(model, speed);
        this.wheels = wheels;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child:" + model + "," + speed + "," + stop + "," + wheels);
    }

    public void setParentSpeed() {
        super.speed = 200;
    }

    public void setChildSpeed() {
        this.speed = 300;
    }
}
