package be.ehb.project.Controller;

import be.ehb.project.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Integer>{


}