package be.ehb.project.Repositroy;

import be.ehb.project.model.Authors;
import be.ehb.project.model.Books;
import be.ehb.project.model.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
public interface CategoryRepository  extends CrudRepository<Category, Integer>{
/*

           Iterable<Category> findCategoryByName(Category category);


    Iterable<Category> deleteByName(Category  category);
*/
}