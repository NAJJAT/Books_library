package be.ehb.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Author_iD;
    private String Author_name;
    private String Author_surname;


    public Authors() {
    }

    public Authors(int Author_iD, String Author_name, String Author_surname) {
        this.Author_iD = Author_iD;
        this.Author_name = Author_name;
        this.Author_surname = Author_surname;
    }


    public int getAuthor_iD() {
        return Author_iD;
    }

    public void setAuthor_iD(int author_iD) {
        Author_iD = author_iD;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    public String getAuthor_surname() {
        return Author_surname;
    }

    public void setAuthor_surname(String author_surname) {
        Author_surname = author_surname;
    }
}
