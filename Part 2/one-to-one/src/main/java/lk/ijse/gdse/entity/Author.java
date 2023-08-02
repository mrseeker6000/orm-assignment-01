package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    private String id;
    private String name;

    @OneToOne
    private Book book;

    public Author(String id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public Author() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
