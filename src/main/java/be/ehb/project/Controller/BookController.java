package be.ehb.project.Controller;


import be.ehb.project.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {
        private CategoryRepository categoryService;
    private BookRepository bookService;


    @Autowired
        public BookController(BookRepository bookService , CategoryRepository categoryService) {
        this.bookService = bookService;
        this.categoryService = categoryService;

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


}