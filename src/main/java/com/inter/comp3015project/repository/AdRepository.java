package com.inter.comp3015project.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.inter.comp3015project.model.Ad;

@Transactional
public interface AdRepository extends CrudRepository<Ad, Integer>
{
	public List<Ad> findByOwnerID(int ownerID);
	public List<Ad> findByType(@Param("type") int type);
}
