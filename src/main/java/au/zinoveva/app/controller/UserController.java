package au.zinoveva.app.controller;

import au.zinoveva.app.domain.User;
import au.zinoveva.app.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService service;

    @GetMapping("/users")
    public List<User> getAll() {
        return this.service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return this.service.getUser(id);
    }

    @PostMapping("/users/body")
    public User save(@RequestBody User user) {
        return this.service.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.service.deleteUser(id);
    }


}
