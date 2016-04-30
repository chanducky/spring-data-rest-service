package com.sm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_item_cat_map")
public class FoodItmCategoryMap implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	   
	@Column(name="item_id" , columnDefinition="int", nullable=false)    
	private int itemId;
	
	@Column(name="cat_id", columnDefinition="int", nullable=false)
	private int catId;

	public FoodItmCategoryMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	@Override
	public String toString() {
		return "FoodItmCategoryMap [id=" + id + ", itemId=" + itemId + ", catId=" + catId + "]";
	}
	
}
