package com.example.bookauthor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class BookAuthorController {
    private BookAuthorService bookAuthorService;

    @Autowired
    public BookAuthorController(BookAuthorService bookAuthorService) {
        this.bookAuthorService = bookAuthorService;
    }

    @RequestMapping("/author")
    public BookAuthor getBookAuthor(@RequestParam Integer id){ return bookAuthorService.getBookAuthor(id); }
    @PostMapping("/create_author")
    public void createBookAuthor(@RequestParam String authorName, @RequestParam Integer yearOfBirth){
        bookAuthorService.createBookAuthor(authorName,yearOfBirth);
    }
    @PostMapping("/update_author")
    public void updateBookAuthor(@RequestParam Integer id,
                                 @RequestParam String authorName,
                                 @RequestParam Integer yearOfBirth){
        bookAuthorService.updateBookAuthor(id,authorName,yearOfBirth);
    }
    @DeleteMapping("/delete_author")
    public void deleteBookAuthor(@RequestParam Integer id){
        bookAuthorService.deleteBookAuthor(id);
    }
    @RequestMapping("/author/getall")
    public List<BookAuthor> getBookAuthors(){ return bookAuthorService.getBookAuthors(); }
}
