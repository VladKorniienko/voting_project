package com.kpi.voting.dao;

import com.kpi.voting.dao.entity.Mark;
import org.springframework.data.repository.CrudRepository;

public interface MarkRepository extends CrudRepository<Mark, Long> {

    Mark findByTitle(String userName);

}