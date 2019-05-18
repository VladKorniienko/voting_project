package com.kpi.voting.controller;

import com.kpi.voting.dao.entity.Test;
import com.kpi.voting.domain.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TestController {
    // Підключення сервісу для тестів
    @Autowired
    private TestService testService;

    // Отримати всі тести
    @GetMapping("/test")
    private List<Test> getAllTests() {
        return testService.getAllTests();
    }

    // Додати новий тест
    @PostMapping("/test")
    private Long saveTest(@RequestBody Test test) {
        return testService.saveOrUpdate(test);

    }
}
