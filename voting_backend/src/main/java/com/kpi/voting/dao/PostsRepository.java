package com.kpi.voting.dao;

import com.kpi.voting.dao.entity.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository<Posts, Long> {
    Posts findByTitle(String postTitle);
}