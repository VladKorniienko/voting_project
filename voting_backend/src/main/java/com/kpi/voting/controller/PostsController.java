package com.kpi.voting.controller;


import com.kpi.voting.dao.entity.Posts;
import com.kpi.voting.domain.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PostsController {

    // Підключення сервісу для користувача
    @Autowired
    private PostsService postService;

    // Отримання всіх постів
    @GetMapping("/posts")
    private List<Posts> getAllPosts() {
        return postService.getAllPosts();
    }


    // Додати новий пост
    @PostMapping("/posts")
    private Long savePost(@RequestBody Posts post) {
        return postService.saveOrUpdate(post);
    }
}
