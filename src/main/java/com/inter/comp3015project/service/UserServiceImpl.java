package com.inter.comp3015project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.inter.comp3015project.model.User;
import com.inter.comp3015project.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Resource
	private UserRepository userRepository;

	@Override
	public List<User> findAll()
	{
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User findById(Integer id)
	{
		return userRepository.findOne(id);
	}

	@Override
	public User findByUsername(String username)
	{
		return userRepository.findByUserName(username);
	}

	@Override
	public User create(User entity)
	{
        User user = new User();
        user.setUserName(entity.getUserName());
        user.setPassword(new BCryptPasswordEncoder().encode(entity.getPassword()));
        return userRepository.save(user);
	}

	@Override
	public User save(User entity)
	{
		return userRepository.save(entity);
	}

	@Override
	public void delete(User entity)
	{
		userRepository.delete(entity);
	}

	@Override
	public void update(User entity)
	{
        User user = userRepository.findOne(entity.getId());
        
        if (user != null)
        {
        	user.setUserName(entity.getUserName());
        	user.setPassword(entity.getPassword());
        	user.setAds(entity.getAds());
        }
	}
}
