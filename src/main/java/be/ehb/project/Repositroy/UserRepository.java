package be.ehb.project.Repositroy;

import be.ehb.project.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<Users, Integer> {


    Users findByFirstname(String firstname);
    Users findBySurname(String surname);
    Users findByEmail(String email);
    Users findByPassword(String password);
    Users findByPhone(String phone);
    Users findByAddress(String address);

    /* Users findByHashedPassword(String hashedPassword);

     */
}