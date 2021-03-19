package ru.itis.spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * created: 06-03-2021 - 12:55
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@Entity
@Table(name = "groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @Column(name = "group_id")
    private String label;

    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Student> students;
}
