package ru.itis.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.spring.auth.ApplicationRole;

import javax.persistence.*;
import java.util.List;

/**
 * created: 13-03-2021 - 12:42
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Column
    @OneToMany(fetch = FetchType.EAGER)
    private List<ApplicationRole> roles;


}
