package be.ehb.project.model;


import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "book_id")
    private int Book_iD;
    private String Title;
    private String ISBN;
    private String publisher_year;
    private String language;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Authors author;


    @OneToMany(mappedBy = "book")
    private List<Loans> loans;

    //constructor
    public Books() {

    }
    //constructor
    public Books(int Book_iD, String Title, String ISBN, String publisher_year, String language) {
        this.Book_iD = Book_iD;
        this.Title = Title;
        this.ISBN = ISBN;
        this.publisher_year = publisher_year;
        this.language = language;
        //add automatically to the list
    }
    //getters and setters
    public int getBook_iD() {
        return Book_iD;
    }

    public void setBook_iD(int book_iD) {
        Book_iD = book_iD;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher_year() {
        return publisher_year;
    }

    public void setPublisher_year(String publisher_year) {
        this.publisher_year = publisher_year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}