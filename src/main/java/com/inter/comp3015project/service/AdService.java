package com.inter.comp3015project.service;

import java.util.List;

import com.inter.comp3015project.model.Ad;

public interface AdService
{
	Ad findById(Integer id);
    Ad save(Ad entity);
    void delete(Ad entity);
    void update(Ad entity);
    List<Ad> findByAdType(int type);
    List<Ad> findByOwner(String username);
    List<Ad> findAll();
}
