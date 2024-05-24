package be.ehb.project.Controller;


import be.ehb.project.model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Authors, Integer> {
}