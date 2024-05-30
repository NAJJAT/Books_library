package be.ehb.project.Controller;

import be.ehb.project.Repositroy.UserRepository;
import be.ehb.project.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private UserRepository userRepository;
}
    /*
    private PasswordEncoder passwordEncoder;
*/
/*
    @Autowired
    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
}
*/

/*
    @PostMapping("/register")
    public void register(@RequestBody Users user) {
         // make new user
        Users newUser = new Users();
        newUser.setUsername(user.getUsername());
        newUser.setFirstname(user.getFirstname());
        newUser.setSurname(user.getSurname());
        newUser.setEmail(user.getEmail());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        newUser.setPhone(user.getPhone());
        newUser.setAddress(user.getAddress());
        userRepository.save(newUser);

    }

    @PostMapping("/login")
    public String login(@RequestParam Users username, @RequestParam String password) {
        // Fetch user from repository by username
        Users user = userRepository.findByusername(username);

        // Check if user exists and if the provided password matches the stored encrypted password
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
    }



*/




