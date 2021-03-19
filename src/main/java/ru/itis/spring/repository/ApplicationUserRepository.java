package ru.itis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.spring.model.ApplicationUser;

/**
 * created: 13-03-2021 - 12:46
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser getApplicationUserByUsername(final String username);

}
