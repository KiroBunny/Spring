package pl.nowszySposob.Database;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public Iterable<User> getUsers(){
        User u1 = new User();
        u1.setName("Edyta");
        u1.setEmail("edyta1998r");
        userRepository.save(u1);

        User u2 = new User();
        u2.setEmail("aa@gmail.com");
        u2.setName("aaaa");
        userRepository.save(u2);

        return userRepository.findAll();
    }


}
