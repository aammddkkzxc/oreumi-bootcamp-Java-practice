package _0201in2;

public class Movie extends Item{
    String director;
    String actor;
    Item item;

    public Movie(Item item, String director, String actor) {
        this.item = item;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        System.out.println("Movie"+ ":" + item.id + "," + item.name + "," + item.price + "," + director + "," + actor);
    }
}
