package be.ehb.project.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int User_iD;
    private String Username;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Password;
    private String Phone;
    private String Address;

    @OneToMany(mappedBy = "user")
    private List<Loans> loans;

    //constructor
    public Users() {
    }
    //constructor
    public Users(int User_iD, String Username, String Firstname, String Lastname, String Email, String Password, String Phone, String Address) {
        this.User_iD = User_iD;
        this.Username = Username;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
    }
    //getters and setters
    public int getUser_iD() {
        return User_iD;
    }

    public void setUser_iD(int user_iD) {
        User_iD = user_iD;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}