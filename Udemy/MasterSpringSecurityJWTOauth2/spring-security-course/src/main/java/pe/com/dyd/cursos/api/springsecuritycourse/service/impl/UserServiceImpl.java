package pe.com.dyd.cursos.api.springsecuritycourse.service.impl;

import ch.qos.logback.core.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;
import pe.com.dyd.cursos.api.springsecuritycourse.exception.InvalidPasswordException;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.entity.User;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.repository.UserRepository;
import pe.com.dyd.cursos.api.springsecuritycourse.persistence.util.Role;
import pe.com.dyd.cursos.api.springsecuritycourse.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerOneCustomer(SaveUser newUser) {
        validatePassword(newUser);

        User user = new User();
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setUsername(newUser.getUsername());
        user.setName(newUser.getName());
        user.setRole(Role.ROLE_CUSTOMER);

        return userRepository.save(user);
    }

    private void validatePassword(SaveUser dto) {
        if (!StringUtils.hasText(dto.getPassword()) || !StringUtils.hasText(dto.getRepeatedPassword())) {
            throw new InvalidPasswordException("Passwords don't match");
        }

        if (!dto.getPassword().equals(dto.getRepeatedPassword())) {
            throw new InvalidPasswordException("Passwords don't match");
        }
    }
}
