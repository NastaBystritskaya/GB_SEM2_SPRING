package au.zinoveva.app.service;

import au.zinoveva.app.domain.User;
import au.zinoveva.app.repository.UserRepository;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {

    UserRepository repository;

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    public User getUser(@NonNull Long id) {
        return this.repository.getReferenceById(id);
    }

    public void deleteUser(@NonNull Long id) {
        this.repository.deleteById(id);
    }

    public void deleteUser(@NonNull User user) {
        this.repository.delete(user);
    }

    public User save(@NonNull User user) {
        return this.repository.save(user);
    }

}
