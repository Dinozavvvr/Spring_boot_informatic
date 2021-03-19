package ru.itis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.spring.model.Student;

import java.util.List;

/**
 * created: 06-03-2021 - 13:15
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> getByIdGreaterThan(Long id);

}
