package _0131;

public class Animal {
    String name;
    boolean sleepStatus;

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