package ru.itis.spring.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.itis.spring.model.ApplicationUser;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * created: 13-03-2021 - 12:49
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public class ApplicationUserDetails implements UserDetails {

    private ApplicationUser applicationUser;

    public ApplicationUserDetails(ApplicationUser user) {
        this.applicationUser = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return applicationUser.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return applicationUser.getPassword();
    }

    @Override
    public String getUsername() {
        return applicationUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
