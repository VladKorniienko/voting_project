package com.kpi.voting.domain;

import com.kpi.voting.dao.TestRepository;
import com.kpi.voting.dao.entity.Question;
import com.kpi.voting.dao.entity.Test;
import com.kpi.voting.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    // Підключення репозиторію для тестів
    @Autowired
    private TestRepository testRepository;

    // Отримати всі тести
    public List<Test> getAllTests() {
        List<Test> tests = new ArrayList<>();
        testRepository.findAll().forEach(test -> tests.add(test));
        return tests;
    }


    // Додати новий тест
    public Long saveOrUpdate(Test test) {
        return testRepository.save(test).getId();
    }
}
