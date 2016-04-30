package com.sm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sm.entity.FoodItem;

@RepositoryRestResource(collectionResourceRel="fooditem",path="fooditem")
public interface FoodItemRepository extends CrudRepository<FoodItem, Integer> { }