package com.kpi.voting.domain;

import com.kpi.voting.dao.PostsRepository;
import com.kpi.voting.dao.entity.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    // Отримати всі пости
    public List<Posts> getAllPosts() {
        List<Posts> posts1 = new ArrayList<Posts>();
        postsRepository.findAll().forEach(posts -> posts1.add(posts));
        return posts1;
    }


    // Додати новий пост
    public Long saveOrUpdate(Posts post) {
        return postsRepository.save(post).getId();
    }

}
