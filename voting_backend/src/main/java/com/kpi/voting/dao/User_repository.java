package com.kpi.voting.dao;

import com.kpi.voting.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface User_repository extends CrudRepository<User, Long> {

    User findByName(String userName);

}
