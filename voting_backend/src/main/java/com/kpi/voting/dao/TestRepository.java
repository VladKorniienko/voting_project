package com.kpi.voting.dao;

import com.kpi.voting.dao.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, Long> {
    Test findByTitle(String testTitle);
}
