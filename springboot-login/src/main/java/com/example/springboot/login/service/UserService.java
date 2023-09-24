package com.example.springboot.login.service;

import com.example.springboot.login.controller.UserDto;
import com.example.springboot.login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
