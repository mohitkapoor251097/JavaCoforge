public class Book2 {
    private String bookname;
    private  String author;
    private long isbn;
    private double price;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }

    public Book2(String bookname, String author, long isbn, double price) {
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
}
