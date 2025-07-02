package pe.com.dyd.cursos.api.springsecuritycourse.service.auth;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.RegisteredUser;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.User;
import pe.com.dyd.cursos.api.springsecuritycourse.service.UserService;

@Service
public class AuthenticationService {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    public RegisteredUser registerOneCustomer(@Valid SaveUser newUser) {
        User user = userService.registerOneCustomer(newUser);

        RegisteredUser userDto = new RegisteredUser();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setUsername(user.getUsername());
        userDto.setRole(user.getRole().name());

        String jwt = jwtService.generateToken(user);
        userDto.setJwt(jwt);

        return userDto;
    }
}
