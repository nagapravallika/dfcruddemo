package com.df.crud.service;

import java.util.Optional;

import com.df.crud.model.UserEntity;

public interface IUserService {
	Optional<UserEntity> findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);
}
