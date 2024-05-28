package be.ehb.project.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int User_iD;
    private String username;
    private String firstname;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "user")
    private List<Loans> loans;

    //constructor
    public Users() {
    }
    //constructor
    public Users(int User_iD, String Username, String Firstname, String Lastname, String Email, String Password, String Phone, String Address) {
        this.User_iD = User_iD;
        this.username = Username;
        this.firstname = Firstname;
        this.surname = Lastname;
        this.email = Email;
        this.password = Password;
        this.phone = Phone;
        this.address = Address;
    }
    //getters and setters
    public int getUser_iD() {
        return User_iD;
    }

    public void setUser_iD(int user_iD) {
        User_iD = user_iD;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}