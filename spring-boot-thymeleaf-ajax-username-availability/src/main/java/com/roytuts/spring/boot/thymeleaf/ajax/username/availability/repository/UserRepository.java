package com.roytuts.spring.boot.thymeleaf.ajax.username.availability.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findUserByUserName(final String userName);

}
