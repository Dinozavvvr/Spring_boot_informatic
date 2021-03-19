package ru.itis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.spring.model.Group;
import ru.itis.spring.model.Student;

/**
 * created: 06-03-2021 - 14:44
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public interface GroupRepository extends JpaRepository<Group, String> {

    Group getByLabel(String label);

}
