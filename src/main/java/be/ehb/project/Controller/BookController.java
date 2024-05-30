package be.ehb.project.Controller;


import be.ehb.project.Repositroy.AuthorRepository;
import be.ehb.project.Repositroy.BookRepository;
import be.ehb.project.Repositroy.CategoryRepository;
import be.ehb.project.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private CategoryRepository categoryService;
    private BookRepository bookService;
    private AuthorRepository authorService;

    @Autowired
    public BookController(BookRepository bookService, CategoryRepository categoryService, AuthorRepository authorService) {
        this.bookService = bookService;
        this.categoryService = categoryService;
        this.authorService = authorService;

    }

    //get all book in database
    @GetMapping("/books/all")
    public ResponseEntity<List<Books>> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        return ResponseEntity.ok(books);
    }

    @PostMapping("/books/create")
    public ResponseEntity<Books> createBook (@RequestBody Books book) {
        //maake a new book
        Books savedBook = bookService.save(book);
        return ResponseEntity.ok(savedBook);




    }
}
/*
    @Id
    private Long id;

    @NotNull
    @Size(min = 2, max = 50)
    private String name;

    @Email
    private String email;

    @Min(18)
    @Max(100)
    private int age;

    @NotBlank
    private String username;

    @NotEmpty
    private String password;

    @PositiveOrZero
    private int balance;

    @Past
    private LocalDate dateOfBirth;
/*
    //Zoeken op id
    @GetMapping("/books/{id}")
    public Books getBookById(@PathVariable int id) {
        return bookService.findById(id).orElse(null);
    }

    //Zoeken  op tital
    @GetMapping("/books/title")
    public List<Books> getBooksByTitle(@PathVariable String Title) {
        return (List<Books>) bookService.findByTitle(Title);
    }
    //Zoeken op ISBN
    @GetMapping("/books/ISBN")
    public List<Books> getBooksByISBN(@PathVariable String ISBN) {
        return (List<Books>) bookService.findByISBN(ISBN);
    }
    //Zoeken op publisher_year
    @GetMapping("/books/publisher_year")
    public List<Books> getBooksByPublisher_year(@PathVariable String publisher_year) {
        return (List<Books>) bookService.findByPublisher_year(publisher_year);
    }
    // Zoeken op language
    @GetMapping("/books/language")
    public List<Books> getBooksByLanguage(@PathVariable String language) {
        return (List<Books>) bookService.findByLanguage(language);
    }
    // Zoeken op Category_id
    @GetMapping("/books/category_id")
    public List<Books> getBooksByCategory(@PathVariable int category) {
        return (List<Books>) bookService.findByCategory(categoryService.findById(category).orElse(null));
    }

    // Zoeken op Author_id
    @GetMapping("/books/author_id")
    public List<Books> getBooksByAuthor(@PathVariable int author) {
        return (List<Books>) bookService.findByAuthorsContaining(authorService.findById(author).orElse(null));
    }

    //Boek toevoegen
    @PostMapping("/books/add")
    public Books addBook(@RequestBody Books book) {
        return bookService.save(book);
    }
    //Boek updaten
    @PutMapping("/books/update/{id}")
    public Books updateBook(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op Title
    @PutMapping("/books/update/title/{id}")
    public Books updateBookTitle(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op ISBN
    @PutMapping("/books/update/ISBN/{id}")
    public Books updateBookISBN(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op publisher_year
    @PutMapping("/books/update/publisher_year/{id}")
    public Books updateBookPublisher_year(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op language
    @PutMapping("/books/update/language/{id}")
    public Books updateBookLanguage(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op Category_id
    @PutMapping("/books/update/category_id/{id}")
    public Books updateBookCategory(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek updaten op Author_id
    @PutMapping("/books/update/author_id/{id}")
    public Books updateBookAuthor(@PathVariable int id, @RequestBody Books book) {
        book.setBook_iD(id);
        return bookService.save(book);
    }
    //Boek verwijderen
    @DeleteMapping("/books/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op Title voor dezr id te verwijderen
    @DeleteMapping("/books/delete/title/{id}")
    public void deleteBookTitle(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op ISBN voor dezr id te verwijderen
    @DeleteMapping("/books/delete/ISBN/{id}")
    public void deleteBookISBN(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op publisher_year voor dezr id te verwijderen
    @DeleteMapping("/books/delete/publisher_year/{id}")
    public void deleteBookPublisher_year(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op language
    @DeleteMapping("/books/delete/language/{id}")
    public void deleteBookLanguage(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op Category_id
    @DeleteMapping("/books/delete/category_id/{id}")
    public void deleteBookCategory(@PathVariable int id) {
        bookService.deleteById(id);
    }
    //Boek verwijderen op Author_id
    @DeleteMapping("/books/delete/author_id/{id}")
    public void deleteBookAuthor(@PathVariable int id) {
        bookService.deleteById(id);
    }
*/
