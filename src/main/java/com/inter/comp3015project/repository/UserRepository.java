package com.inter.comp3015project.repository;

import org.springframework.data.repository.CrudRepository;

import com.inter.comp3015project.model.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	User findByUserName(String username);
}