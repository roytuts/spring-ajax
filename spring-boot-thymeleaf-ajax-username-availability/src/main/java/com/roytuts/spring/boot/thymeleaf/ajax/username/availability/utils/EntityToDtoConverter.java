package com.roytuts.spring.boot.thymeleaf.ajax.username.availability.utils;

import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.dto.UserDto;
import com.roytuts.spring.boot.thymeleaf.ajax.username.availability.entity.User;

public final class EntityToDtoConverter {

	private EntityToDtoConverter() {
	}

	public static UserDto convertUserEntityToDto(final User user) {
		return new UserDto(user.getId(), user.getUserName());
	}

}
