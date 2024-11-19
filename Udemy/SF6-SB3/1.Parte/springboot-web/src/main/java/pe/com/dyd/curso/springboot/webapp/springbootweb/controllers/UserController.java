package pe.com.dyd.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.dyd.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Edgard", "Marquez");
        user.setEmail("edgardmarquez@correo.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        //List<User> users = new ArrayList<>();
        List<User> users = Arrays.asList(
            new User("Luis", "Gonzales"),
            new User("Perico", "Los Palotes", "perico.lospaloes@empresa.com"),
            new User("Ulderico", "Mendez", "ulderico.mendez@empresa.com"),
            new User("Inocencio", "Perez")
        );

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
    
}
