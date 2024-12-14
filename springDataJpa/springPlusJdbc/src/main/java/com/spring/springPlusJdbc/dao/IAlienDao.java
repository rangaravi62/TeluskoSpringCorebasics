package com.spring.springPlusJdbc.dao;

import com.spring.springPlusJdbc.model.Alien;

import java.util.List;

public interface IAlienDao {
    List<Alien> getAlienInfo();
}
