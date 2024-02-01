package _0131;

public class Animal {
    final int leg;
    String name;
    boolean sleepStatus;

    public Animal() {
        leg=3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        sleepStatus = true;
    }
}