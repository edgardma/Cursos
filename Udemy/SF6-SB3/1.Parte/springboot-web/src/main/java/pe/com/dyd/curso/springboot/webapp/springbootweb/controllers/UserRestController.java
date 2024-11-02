package pe.com.dyd.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.curso.springboot.webapp.springbootweb.models.User;
import pe.com.dyd.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Edgard", "Marquez");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping(path="/list")
    public List<User> list() {
        List<User> users = new ArrayList<>();

        users.add(new User("Edgard", "Marquez"));
        users.add(new User("Pepe", "Lopez"));
        users.add(new User("Lucho", "Gonzales"));

        return users;
    }

    @GetMapping(path="/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Edgard", "Marquez");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
    
}
