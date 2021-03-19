package ru.itis.spring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.spring.model.User;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(int id) {
        if (id == 1) {
            return User.builder()
                    .id(1L)
                    .userName("user1")
                    .build();
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        var users = new LinkedList<User>();
        var user = User.builder()
                .id(1L)
                .userName("user1")
                .build();
        users.add(user);
        return users;
    }

    public List<User> getAllUsersByYear(@RequestParam final int year) {
        var users = new LinkedList<User>();
        var user1 = User.builder()
                .id(1L)
                .userName("user1")
                .year(new Timestamp(238782130))
                .build();
        var user2 = User.builder()
                .id(2L)
                .userName("user2")
                .year(new Timestamp(173298127))
                .build();
        var user3 = User.builder()
                .id(3L)
                .userName("user3")
                .year(new Timestamp(127398174))
                .build();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users.stream()
                .filter(user -> false)
                .collect(Collectors.toList());
    }
}
