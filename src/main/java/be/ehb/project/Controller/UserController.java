package be.ehb.project.Controller;

import be.ehb.project.Repositroy.UserRepository;
import be.ehb.project.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserController {
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;


    /*
    private int User_iD;
    private String Username;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Password;
    private String Phone;
    private String Address;
     */

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable int id) {
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping("/users")
    public Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{password}")
    public Users getUserByPassword(@PathVariable String password) {
        return userRepository.findByPassword(password);
    }

    @GetMapping("/users/{name}")
    public Users getUserByName(@PathVariable String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/users/{surname}")
    public Users getUserBySurname(@PathVariable String surname) {
        return userRepository.findBySurname(surname);
    }

    @GetMapping("/users/{email}")
    public Users getUserByEmail(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }

    @GetMapping("/users/{Phone}")
    public Users getUserByPhone(@PathVariable String phone) {
        return userRepository.findByPhone(phone);
    }

    @GetMapping("/users/{Address}")
    public Users getUserByAddress(@PathVariable String address) {
        return userRepository.findByAddress(address);
    }

    @PostMapping("/users")
    public Users addUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    @PostMapping("/users/{id}")
    public Users updateUser(@PathVariable int id, @RequestBody Users user) {
        Users existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setFirstname(user.getUsername());
            existingUser.setLastname(user.getLastname());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());

            existingUser.setPhone(user.getPhone());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @PostMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/users/{name}")
    public void deleteUserByName(@PathVariable String name) {
        if (userRepository.findByName(name) != null) {
            userRepository.save(userRepository.findByName(name));
        }
    }

    @PostMapping("/users/{surname}")
    public void deleteUserBySurname(@PathVariable String surname) {
        if (userRepository.findBySurname(surname) != null) {
            userRepository.save(userRepository.findBySurname(surname));
        }
    }

    @PostMapping("/users/{email}")
    public void deleteUserByEmail(@PathVariable String email) {
        if (userRepository.findByEmail(email) != null) {
            userRepository.save(userRepository.findByEmail(email));
        }
    }

    @PostMapping("/users/register") // Consider a more descriptive endpoint
    public Users register(@RequestBody Users usermodel) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Users user = new Users();
        user.setFirstname(usermodel.getFirstname());
        user.setLastname(usermodel.getLastname());
        user.setEmail(usermodel.getEmail());
        user.setPassword(passwordEncoder.encode(usermodel.getPassword()));
        user.setPhone(usermodel.getPhone());
        user.setAddress(usermodel.getAddress());
        return userRepository.save(user);
    }

    @PostMapping("/users/login") // Consider a more descriptive endpoint
    public Users login(@RequestBody Users usermodel) {
        Users user = userRepository.findByEmail(usermodel.getEmail());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (passwordEncoder.matches(usermodel.getPassword(), user.getPassword())) {
            return user;
        }
        return null;

    }
}








