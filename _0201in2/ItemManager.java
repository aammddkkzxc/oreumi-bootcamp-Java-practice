package _0201in2;

public class ItemManager {
    public static void main(String[] args) {
        Item item = new Item("aamddkkzxc", "김상형", 1000);
        Album album = new Album("estSoft", "이스트소프트", 2000, "오르미");
        Movie movie = new Movie(item, "멘토", "김재경");
        Book book = new Book("aamddkkzxc","김상형",1000, "백엔드", 4);

        item.print();
        album.print();
        movie.print();
        book.print();
    }
}
