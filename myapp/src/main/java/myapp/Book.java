package myapp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String title;
    
    private String author;
    
    private String isbn;
    
    // Getters and Setters
    
    public Long getId() {
    
    return id;
    
    }
    
    public void setId(Long id) {
    
    this.id = id;
    
    }
    
    public String getTitle() {
    
    return title;
    
    }
    
    public void setTitle(String title) {
    
    this.title = title;
    
    }
    
    public String getAuthor() {
    
    return author;
    
    }
    
    public void setAuthor(String author) {
    
    this.author = author;
    
    }
    
    public String getIsbn() {
    
    return isbn;
    
    }
    
    public void setIsbn(String isbn) {
    
    this.isbn = isbn;
    
    }
    
    
}
