package be.ehb.project.model;

import jakarta.persistence.*;

@Entity
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Loan_iD;
    private String Loan_date;
    private String Return_date;
    private String Status;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Books book;
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;
    //constructor
    public Loans() {
    }

    //constructor
    public Loans(int Loan_iD, int User_iD, String Loan_date, String Return_date, String Status) {
        this.Loan_iD = Loan_iD;
        this.Loan_date = Loan_date;
        this.Return_date = Return_date;
        this.Status = Status;
    }
    //getters and setters

    public int getLoan_iD() {
        return Loan_iD;
    }

    public void setLoan_iD(int loan_iD) {
        Loan_iD = loan_iD;
    }


    public String getLoan_date() {
        return Loan_date;
    }

    public void setLoan_date(String loan_date) {
        Loan_date = loan_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public void setReturn_date(String return_date) {
        Return_date = return_date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Users getUser() {
        return user;
    }
}