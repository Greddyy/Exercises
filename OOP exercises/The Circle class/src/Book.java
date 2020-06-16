public class Book {
    private String name;
    private double price;
    private Author author;
    private int quantity = 0;


    public Book(String name, Author author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + author + ", " + quantity;
    }
}
