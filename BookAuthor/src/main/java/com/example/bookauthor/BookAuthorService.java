package com.example.bookauthor;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookAuthorService {
    private List<BookAuthor> bookAuthorList;

    public BookAuthorService(){
        bookAuthorList = new ArrayList<>();
        BookAuthor author1 = new BookAuthor("Janja",1999);
        BookAuthor author2 = new BookAuthor("Vlado",1995);
        BookAuthor author3 = new BookAuthor("Ivan",1997);
        BookAuthor author4 = new BookAuthor("Fabo",1992);

        bookAuthorList.addAll(Arrays.asList(author1,author2,author3,author4));
    }
    public BookAuthor getBookAuthor(Integer id) {
        return bookAuthorList.get(id);
    }
    public void createBookAuthor(String authorName, int yearOfBirth){ bookAuthorList.add(new BookAuthor(authorName,yearOfBirth)); }
    public void updateBookAuthor(int id, String authorName, int yearOfBirth){
        bookAuthorList.get(id).setAuthorName(authorName);
        bookAuthorList.get(id).setYearOfBirth(yearOfBirth);
    }
    public void deleteBookAuthor(int id){ bookAuthorList.remove(id); }
    public List<BookAuthor> getBookAuthors(){ return bookAuthorList; }
}
