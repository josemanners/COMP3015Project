package com.inter.comp3015project.service;

import java.util.List;

import com.inter.comp3015project.model.User;

public interface UserService
{
    List<User> findAll();
    User findById(Integer id);
    User findByUsername(String username);
    User create(User entity);
    User save(User entity);
    void delete(User entity);
    void update(User entity);
}
