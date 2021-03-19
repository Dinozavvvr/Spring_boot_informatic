package ru.itis.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * created: 06-03-2021 - 12:39
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


}
