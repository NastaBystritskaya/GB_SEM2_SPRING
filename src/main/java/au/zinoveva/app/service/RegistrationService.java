package au.zinoveva.app.service;

import au.zinoveva.app.domain.User;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RegistrationService {

    UserService service;

    NotificationService notificationService;

    public void register(User user) {
        this.service.save(user);
        notificationService.message("Пользователь зарегестрирован");
    }



}
