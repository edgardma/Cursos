package pe.com.dyd.cursos.api.springsecuritycourse.service;

import jakarta.validation.Valid;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.User;

import java.util.Optional;

public interface UserService {

    User registerOneCustomer(@Valid SaveUser newUser);

    Optional<User> findOneByUsername(String username);
}
