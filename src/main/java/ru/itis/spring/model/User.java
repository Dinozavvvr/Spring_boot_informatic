package ru.itis.spring.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * User
 * created: 13-02-2021 - 14:49
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */

@Data
@Builder
public class User {

    private Long id;

    private String userName;

    private Timestamp year;

}
