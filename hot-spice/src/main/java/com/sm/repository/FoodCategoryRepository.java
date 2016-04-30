package com.sm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sm.entity.FoodCategory;

@RepositoryRestResource(collectionResourceRel="foodcategory",path="foodcategory")
public interface FoodCategoryRepository  extends CrudRepository<FoodCategory, Integer> {
	
	@RestResource(path="searchfoodcategory",rel="searchfoodcategory")
	List<FoodCategory> findByCatNameContains(@Param("catname")String catName);
}
