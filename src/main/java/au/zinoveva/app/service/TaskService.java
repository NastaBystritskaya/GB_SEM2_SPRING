package au.zinoveva.app.service;

import au.zinoveva.app.domain.User;
import au.zinoveva.app.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TaskService {

    UserRepository repository;

    public List<User> filterUsersByAge(int age) {
        return this.repository.findAllByAge(age);
    }

    public int getAgeAverage() {
        return this.repository.getAvg();
    }
}
