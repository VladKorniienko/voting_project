package com.kpi.voting.domain;

import com.kpi.voting.dao.User_repository;
import com.kpi.voting.dao.entity.Mark;
import com.kpi.voting.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // Підключення репозиторію для користувачів
    @Autowired
    private User_repository userRepository;

    // Отримати всіх користувачів
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    // Додати результат проходження тесту користувачеві
    public void addUserMarkById(Mark newMark, Long id) {
         User user = userRepository.findById(id).get();
         List<Mark> marks =  user.getMarks();
         marks.add(newMark);
         user.setMarks(marks);
         userRepository.save(user);
    }

    // Додати нового користувача
    public Long saveOrUpdate(User user) {
        return userRepository.save(user).getId();
    }
}
