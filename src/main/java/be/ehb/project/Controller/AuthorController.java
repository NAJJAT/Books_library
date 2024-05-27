package be.ehb.project.Controller;

import be.ehb.project.Repositroy.AuthorRepository;
import be.ehb.project.model.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

        private AuthorRepository authorService;


        @Autowired
        public AuthorController(AuthorRepository authorService){
            this.authorService = authorService;
        }

        @GetMapping("/authors")
        public Iterable<Authors> getAllAuthors() {
            return authorService.findAll();
        }

        @GetMapping("/authors/{id}")
        public Authors getAuthorById(@PathVariable int id) {
            return authorService.findById(id).get();
        }

        @PostMapping("/authors")
        public Authors addAuthor(@RequestBody Authors author) {
            return authorService.save(author);
        }

        @PutMapping("/authors")
        public Authors updateAuthor(@RequestBody Authors author) {
            return authorService.save(author);
        }

        @DeleteMapping("/authors/{id}")
        public void deleteAuthor(@PathVariable int id) {
            authorService.deleteById(id);
        }









}
