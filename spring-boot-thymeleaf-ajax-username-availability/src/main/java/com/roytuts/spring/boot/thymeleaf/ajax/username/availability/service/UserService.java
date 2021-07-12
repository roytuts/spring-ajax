package com.roytuts.spring.boot.thymeleaf.ajax.username.availability.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.dto.UserDto;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.entity.User;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.repository.UserRepository;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.utils.EntityToDtoConverter;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto getUserByUserName(final String userName) {
		Optional<User> user = userRepository.findUserByUserName(userName);

		if (user.isPresent()) {
			return EntityToDtoConverter.convertUserEntityToDto(user.get());
		}

		throw new RuntimeException("No user available for the given user name");
	}

}
