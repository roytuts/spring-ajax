package com.roytuts.spring.boot.thymeleaf.ajax.username.availability.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.dto.UserDto;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.dto.UserInput;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<UserDto> getUserByUserName(@RequestBody UserInput userInput) {
		UserDto userDto = userService.getUserByUserName(userInput.getUserName());

		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
	}

}
