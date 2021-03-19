package ru.itis.spring.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.spring.model.ApplicationUser;
import ru.itis.spring.services.LoginServiceImpl;

/**
 * created: 13-03-2021 - 13:17
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@RestController
public class SignUpController {

    private final LoginServiceImpl loginService;

    public SignUpController(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/registration")
    public ApplicationUser register(@RequestBody ApplicationUser applicationUser) {
        return loginService.save(applicationUser);
    }

}
