package com.sm.repository;

import com.sm.entity.FoodItmCategoryMap;

public interface FoodItmCategoryMapIDao {
	public FoodItmCategoryMap returnIfExist(Integer catId, Integer itemId);
}
