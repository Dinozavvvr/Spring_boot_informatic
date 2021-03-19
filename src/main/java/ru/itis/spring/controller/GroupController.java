package ru.itis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.spring.model.Group;
import ru.itis.spring.services.GroupService;

/**
 * created: 06-03-2021 - 14:48
 * project: Gradle_example
 *
 * @author dinar
 * @version v0.1
 */
@RestController
public class GroupController {

    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/group/{id}")
    public Group getGroup(@PathVariable String id) {
        return groupService.getByLabel(id);
    }

}
