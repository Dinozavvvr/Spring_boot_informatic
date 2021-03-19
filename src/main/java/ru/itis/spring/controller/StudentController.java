package ru.itis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.itis.spring.model.Student;
import ru.itis.spring.services.StudentService;

import java.util.List;

/**
 * created: 06-03-2021 - 13:21
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */

@RestController()
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/student/{id}")
    public Student getUserById(@PathVariable final Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public Student save(@RequestBody final Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students/all/{minId}")
    public List<Student> getAllByMinId(@PathVariable Long minId) {
        return studentService.getByIdGreaterThan(minId);
    }
}
