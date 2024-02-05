package _0205;

public class Adult implements Run, Walk{

    @Override
    public void run() {
        System.out.println("어른이 빠르게 뜁니다");
    }

    @Override
    public void walk() {
        System.out.println("어른이 많이 걷습니다");
    }
}
