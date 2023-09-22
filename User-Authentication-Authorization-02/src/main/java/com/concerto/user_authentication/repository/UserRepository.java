package com.concerto.user_authentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concerto.user_authentication.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	public Optional<User> findByEmail(String email);
}
