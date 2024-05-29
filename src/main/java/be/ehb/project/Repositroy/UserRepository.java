package be.ehb.project.Repositroy;

import be.ehb.project.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Users, Integer> {


    Users findByusername(Users username);



}