package _0201in2;

public class Book extends Item{
    String author;
    int isbn;

    public Book(String id, String name, int price, String author, int isbn) {
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.println("Book"+ ":" + id + "," + name + "," + price + "," + author + "," + isbn);
    }
}
