package ru.itis.spring.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * created: 13-03-2021 - 14:09
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ApplicationRole {

    @Id
    private String role;

}
