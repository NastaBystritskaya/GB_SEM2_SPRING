package au.zinoveva.app.controller;

import au.zinoveva.app.domain.User;
import au.zinoveva.app.repository.UserRepository;
import au.zinoveva.app.service.TaskService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskController {

    TaskService service;

    @GetMapping("/filter/{age}")
    public List<User> getUsersByAge(@PathVariable("age") int age) {
        return this.service.filterUsersByAge(age);
    }

    @GetMapping("/calc")
    public int getAverage() {
        return this.service.getAgeAverage();
    }

}
