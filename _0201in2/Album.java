package _0201in2;

public class Album extends Item{
    String artist;

    public Album(String id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        System.out.println("Album"+ ":" + id + "," + name + "," + price + "," + artist);
    }
}
