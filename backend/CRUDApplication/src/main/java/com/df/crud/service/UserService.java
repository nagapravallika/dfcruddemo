package com.df.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.crud.model.UserEntity;
import com.df.crud.repository.UserRepository;
@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<UserEntity> findByUsername(String username) {
		 return userRepository.findByUsername(username);
	}



	@Override
	public boolean existsByUsername(String username) {
		return userRepository.existsByUsername(username);
	}

	@Override
	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
}
