package _0201;

public class Car {
    private int speed;
    private boolean stop;

    void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void isStop() {
        if(stop) {
            speed = 0;
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
