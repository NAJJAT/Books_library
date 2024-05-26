package be.ehb.project.Controller;


import be.ehb.project.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {
        private CategoryRepository categoryService;
        private BookRepository bookService;
        private AuthorRepository authorService;


    @Autowired
        public BookController(BookRepository bookService , CategoryRepository categoryService , AuthorRepository authorService ){
        this.bookService = bookService;
        this.categoryService = categoryService;
        this.authorService = authorService;


    }

    @GetMapping("/books")
    public Iterable<Books> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public Books getBookById(@PathVariable int id) {
        return bookService.findById(id).orElse(null);
    }

    @GetMapping("/books/category")
    public List<Books> getBooksByCategory(@PathVariable int category) {
        return (List<Books>) bookService.findByCategory(categoryService.findById(category).orElse(null));
    }

@GetMapping("/books/language")
    public List<Books> getBooksByLanguage(@PathVariable String language) {
        return (List<Books>) bookService.findByLanguage(language);
    }

    @GetMapping("/books/author")
    public List<Books> getBooksByAuthor(@PathVariable int author) {
        return (List<Books>) bookService.findByAuthorsContaining(authorService.findById(author).orElse(null));
    }
    @PostMapping("/books")
    public Books addBook(Books book) {

        return bookService.save(book);
    }

    @PostMapping("/books/{id}")
    public Books updateBook(@PathVariable int id, Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }


    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteById(id);
    }





}