package com.concerto.jwtauth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.concerto.jwtauth.model.UserDao;

@Repository
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}