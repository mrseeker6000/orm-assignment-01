package lk.ijse.gdse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private String id;
    private String title;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
