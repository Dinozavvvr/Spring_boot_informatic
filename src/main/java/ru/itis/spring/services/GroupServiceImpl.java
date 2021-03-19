package ru.itis.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.spring.model.Group;
import ru.itis.spring.repository.GroupRepository;

/**
 * created: 06-03-2021 - 14:47
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group getByLabel(String label) {
        return groupRepository.getByLabel(label);
    }
}
