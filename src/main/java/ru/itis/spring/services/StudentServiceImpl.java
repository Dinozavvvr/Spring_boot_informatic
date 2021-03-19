package ru.itis.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.spring.model.Student;
import ru.itis.spring.repository.StudentRepository;

import java.util.List;

/**
 * created: 06-03-2021 - 13:18
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student saveStudent(Student student) {
        if (student != null) {
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public List<Student> getByIdGreaterThan(Long id) {
        return studentRepository.getByIdGreaterThan(id);
    }
}
