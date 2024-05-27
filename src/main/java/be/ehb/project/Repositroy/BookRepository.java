package be.ehb.project.Repositroy;

import be.ehb.project.model.Authors;
import be.ehb.project.model.Books;
import be.ehb.project.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {

    //make findByCategory method


       Iterable<Books> findByCategory(Category category);

        Iterable<Books> findByAuthorsContaining(Authors author);
        //make findByLanguage method
        Iterable<Books> findByLanguage(String language);






    }
