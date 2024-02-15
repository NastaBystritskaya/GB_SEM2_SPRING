package au.zinoveva.app.repository;

import au.zinoveva.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByAge(int age);

    @Query("select AVG(u.age) from User u")
    int getAvg();

}
