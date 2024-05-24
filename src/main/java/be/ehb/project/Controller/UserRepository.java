package be.ehb.project.Controller;

import be.ehb.project.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Users, Integer> {

}