package com.sm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sm.entity.FoodItmCategoryMap;


@RepositoryRestResource(collectionResourceRel="fooditemcategorymap",path="fooditemcategorymap")
public interface FoodItmCategoryMapRepository extends CrudRepository<FoodItmCategoryMap, Integer> { 

	List<FoodItmCategoryMap> findBycatIdAndItemId(Integer catId, Integer itemId);
}

