package ru.itis.spring.services;

import ru.itis.spring.model.Group;

/**
 * created: 06-03-2021 - 14:47
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
public interface GroupService {

    Group getByLabel(String label);

}
