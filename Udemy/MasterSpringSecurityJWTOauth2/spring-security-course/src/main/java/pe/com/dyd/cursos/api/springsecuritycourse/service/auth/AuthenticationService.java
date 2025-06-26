package pe.com.dyd.cursos.api.springsecuritycourse.service.auth;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.RegisteredUser;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;

@Service
public class AuthenticationService {
    public RegisteredUser registerOneCustomer(@Valid SaveUser newUser) {
        return null;
    }
}
