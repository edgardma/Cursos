package pe.com.dyd.cursos.api.springsecuritycourse.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.RegisteredUser;
import pe.com.dyd.cursos.api.springsecuritycourse.dto.SaveUser;
import pe.com.dyd.cursos.api.springsecuritycourse.service.auth.AuthenticationService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<RegisteredUser> registreOne(@RequestBody @Valid SaveUser newUser) {
        RegisteredUser registeredUser = authenticationService.registerOneCustomer(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
    }
}
