package com.spring.springDataJdbc.dao;

import com.spring.springDataJdbc.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AlienDaoImpl {

    @Autowired
    private JdbcTemplate template;

    String sql = "INSERT INTO alien (id,name,city) VALUES (?,?,?);";

    public boolean insert(Alien alien){
        int rows = template.update(sql,alien.getId(),alien.getName(),alien.getCity());
        return rows == 1;
    }
}
