package pro.ivashchuk.moviesadvisor.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pro.ivashchuk.moviesadvisor.domain.User;
import pro.ivashchuk.moviesadvisor.repository.JpaUserRepository;

import java.util.List;

@RestController("RestUserController")
@RequestMapping(path = "/api/users", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserController {
    private JpaUserRepository jpaUserRepository;

    public UserController(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return jpaUserRepository.findAll();
    }

    @GetMapping("/registration")
    public String addNewUser() {
        return "";
    }
}
