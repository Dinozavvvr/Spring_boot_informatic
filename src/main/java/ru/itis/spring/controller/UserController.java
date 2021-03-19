package ru.itis.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.spring.model.User;

/**
 * created: 06-03-2021 - 12:32
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.spring.services.UserService;

import java.util.List;

@RestController()
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable final int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/all/filtered")
    public List<User> getAllUsersByYear(@RequestParam final int year) {
        return userService.getAllUsersByYear(year);
    }

    @PostMapping("/user")
    public User save(@RequestBody final User user)   {
        System.out.println(user);
        return user;
    }

}
