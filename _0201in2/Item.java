package _0201in2;

public class Item {
    String id;
    String name;
    int price;

    public Item() {

    }

    public Item(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("Item"+ ":" + id + "," + name + "," + price);
    }
}
