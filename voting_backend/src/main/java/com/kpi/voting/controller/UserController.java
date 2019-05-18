package com.kpi.voting.controller;

import com.kpi.voting.dao.entity.Mark;
import com.kpi.voting.dao.entity.User;
import com.kpi.voting.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    // Підключення сервісу для користувача
    @Autowired
    private UserService userService;

    // Отримання всіх користувачів
    @GetMapping("/user")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Додати результат проходження тесту користувачеві
    @PostMapping("/user/{id}")
    private Long addUserMark(@PathVariable("id") Long id, @RequestBody Mark mark ) {
        userService.addUserMarkById(mark, id);
        return id;
    }

    // Додати нового користувача
    @PostMapping("/user")
    private Long saveUser(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }
}
