package book;

import java.util.Objects;

public class Book {
    int bookCode;
    String name;
    int price;
    String author;

    public Book() {
    }

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book bookCode(int bookCode) {
        setBookCode(bookCode);
        return this;
    }

    public Book name(String name) {
        setName(name);
        return this;
    }

    public Book price(int price) {
        setPrice(price);
        return this;
    }

    public Book author(String author) {
        setAuthor(author);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return bookCode == book.bookCode && Objects.equals(name, book.name) && price == book.price && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookCode, name, price, author);
    }

    @Override
    public String toString() {
        return "{" +
            " bookCode='" + getBookCode() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }

}
