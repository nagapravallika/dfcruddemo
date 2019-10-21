package com.df.crud.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.df.crud.model.UserEntity;
import com.df.crud.service.IUserService;
import com.df.crud.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users/{username}")
    public UserEntity getUserProfile(@PathVariable(value = "username") String username) {
    	
    	Optional<UserEntity> user = null;
    	try {
    	userService.findByUsername(username);
    	logger.info("in get user profile");
    	}catch(Exception e) {
    		e.printStackTrace();
    		logger.error("error in get profile method of usercontroller"+e.getMessage());
    	}
        return user.get();
    }
}
