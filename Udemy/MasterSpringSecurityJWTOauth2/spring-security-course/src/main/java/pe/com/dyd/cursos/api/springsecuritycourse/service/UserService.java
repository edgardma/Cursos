package pe.com.dyd.cursos.api.springsecuritycourse.service;

import jakarta.validation.Valid;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.User;

public interface UserService {

    User registerOneCustomer(@Valid SaveUser newUser);
}
