package _0202;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        zookeeper.feed(lion);
        zookeeper.feed(tiger);
    }
}

class Animal {
    String name;
}

class Lion implements Predator {

}

class Tiger {

}

class Zookeeper {
    void feed(Lion lion) {
        System.out.println("생선");
    }

    void feed(Tiger tiger) {
        System.out.println("고기");
    }
}