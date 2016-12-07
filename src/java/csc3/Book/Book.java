package csc3.Book;

import java.io.Serializable;
import csc3.Book.DateCalculator;
import java.time.LocalDate;
import java.util.Date;

public class Book implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String bookTitle;
    private String date;

    public Book() {
        firstName = "";
        lastName = "";
        email = "";
        bookTitle= "";
        date = "";
    }

    public Book(String firstName, String lastName, String email, String bookTitle, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bookTitle = bookTitle;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public String getDate(){
        return date;
    }
    public void setDate (String date){
        this.date = date;
    }

}
