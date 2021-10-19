package technobel.gedev.school_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import technobel.gedev.school_managment.models.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
