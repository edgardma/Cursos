package pe.com.dyd.cursos.api.springsecuritycourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
