package _0205;

public class Child implements Run, Walk{
    @Override
    public void run() {
        System.out.println("아이가 뜁니다");
    }

    @Override
    public void walk() {
        System.out.println("아이가 걷습니다");
    }
}
