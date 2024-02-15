package au.zinoveva.app.service;

import lombok.NonNull;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class NotificationService {

    public void message(@NonNull String message) {
        log.info(message);
    }

}
