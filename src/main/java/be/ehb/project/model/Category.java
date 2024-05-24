package be.ehb.project.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Category_iD;

    private String Category_name;
    @OneToMany(mappedBy = "category")
    private List<Books> books;
    //constructor
    public Category() {
    }

    //constructor
    public Category(int Category_iD, String Category_name) {
        this.Category_iD = Category_iD;
        this.Category_name = Category_name;
    }
    //getters and setters


    public int getCategory_iD() {
        return Category_iD;
    }

    public void setCategory_iD(int category_iD) {
        Category_iD = category_iD;
    }

    public String getCategory_name() {
        return Category_name;
    }

    public void setCategory_name(String category_name) {
        Category_name = category_name;
    }
}