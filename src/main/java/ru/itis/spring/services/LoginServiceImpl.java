package ru.itis.spring.services;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.spring.auth.ApplicationRole;
import ru.itis.spring.auth.ApplicationUserDetails;
import ru.itis.spring.model.ApplicationUser;
import ru.itis.spring.repository.ApplicationUserRepository;

import java.util.ArrayList;
import java.util.Collections;

/**
 * created: 13-03-2021 - 12:48
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@Service
public class LoginServiceImpl implements UserDetailsService {

    private final ApplicationUserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public LoginServiceImpl(ApplicationUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        val user =  userRepository.getApplicationUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("user not found by username : " + username);
        }

        return new ApplicationUserDetails(user);
    }

    public ApplicationUser save(ApplicationUser applicationUser) {
        applicationUser.setPassword(passwordEncoder.encode(applicationUser.getPassword()));
        applicationUser.setRoles(Collections.singletonList(
                new ApplicationRole("ROLE_USER")));
        return userRepository.save(applicationUser);
    }
}
