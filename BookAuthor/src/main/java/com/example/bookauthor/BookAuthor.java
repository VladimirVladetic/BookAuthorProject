package com.example.bookauthor;

public class BookAuthor {
    private String authorName;
    private int yearOfBirth;
    public BookAuthor(String authorName, int yearOfBirth){
        this.authorName = authorName;
        this.yearOfBirth = yearOfBirth;
    }
    public String getAuthorName(){ return authorName; }
    public int getYearOfBirth(){ return yearOfBirth; }
    public void setAuthorName(String authorName){ this.authorName = authorName; }
    public void setYearOfBirth(int yearOfBirth){ this.yearOfBirth = yearOfBirth; }
}
