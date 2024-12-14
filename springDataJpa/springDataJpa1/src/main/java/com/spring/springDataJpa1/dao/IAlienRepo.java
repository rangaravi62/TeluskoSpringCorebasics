package com.spring.springDataJpa1.dao;

import com.spring.springDataJpa1.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface IAlienRepo extends CrudRepository<Alien,Integer> {
}
