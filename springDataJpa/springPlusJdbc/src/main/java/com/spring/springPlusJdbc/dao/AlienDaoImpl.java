package com.spring.springPlusJdbc.dao;

import com.spring.springPlusJdbc.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienDaoImpl implements IAlienDao{

    @Autowired
    private DataSource dataSource;

    List<Alien> alienList;

    @Override
    public List<Alien> getAlienInfo() {
        try {
            Connection con = dataSource.getConnection();
            System.out.println("connection class from hikari connection pool-> "+con.getClass().getName()); // com.zaxxer.hikari.pool.HikariProxyConnection
            ResultSet rs = con.prepareStatement("select * from alien;").executeQuery();
            alienList = new ArrayList<>();
            while (rs.next()){
                Alien alien = new Alien();
                alien.setId(rs.getInt(1));
                alien.setName(rs.getString(2));
                alien.setCity(rs.getString(3));
                alienList.add(alien);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return alienList;
    }
}
