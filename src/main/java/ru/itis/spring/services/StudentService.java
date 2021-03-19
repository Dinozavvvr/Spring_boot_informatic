package ru.itis.spring.services;

import ru.itis.spring.model.Student;

import java.util.List;

/**
 * created: 06-03-2021 - 13:17
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public interface StudentService {

    Student getStudentById(final Long id);

    Student saveStudent(final Student student);

    List<Student> getByIdGreaterThan(Long id);

}
