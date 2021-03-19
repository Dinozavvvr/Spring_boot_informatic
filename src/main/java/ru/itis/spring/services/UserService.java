package ru.itis.spring.services;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.spring.model.User;

import java.util.List;

public interface UserService {
    User getUserById(final int id);
    List<User> getAllUsers();
    List<User> getAllUsersByYear(@RequestParam final int year);
}
