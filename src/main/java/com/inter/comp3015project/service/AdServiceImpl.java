package com.inter.comp3015project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.inter.comp3015project.model.Ad;
import com.inter.comp3015project.repository.AdRepository;

@Service("adService")
public class AdServiceImpl implements AdService
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Resource
	private AdRepository adRepository;

	@Override
	public Ad findById(Integer id)
	{
		return this.adRepository.findOne(id);
	}

	@Override
	public Ad save(Ad entity)
	{
		return this.adRepository.save(entity);
	}

	@Override
	public void delete(Ad entity)
	{
		this.adRepository.delete(entity);
	}

	@Override
	public void update(Ad entity)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ad> findByAdType(int type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ad> findByOwner(String username)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ad> findAll()
	{
		return (List<Ad>)this.adRepository.findAll();
	}
}
