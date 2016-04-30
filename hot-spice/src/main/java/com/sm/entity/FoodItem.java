package com.sm.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="food_item")
public class FoodItem  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id", columnDefinition="int", nullable=false )
	private int itemId;

	private String name;

	private String description;

	private double price;

	@Embedded
	AuditDetails audit;

	public FoodItem() {
		super();
	}
/*
	@OneToMany(mappedBy="foodItem" ,fetch = FetchType.EAGER, cascade=CascadeType.ALL, targetEntity=FoodItmFoodCategoryMap.class)
	Set<FoodItmFoodCategoryMap> foodItemCategoryMap = new HashSet<FoodItmFoodCategoryMap>();
*/
	@ManyToMany(mappedBy="fooditem")
	Set<FoodCategory> foodcategory = new HashSet<FoodCategory>();

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public AuditDetails getAudit() {
		return audit;
	}

	public void setAudit(AuditDetails audit) {
		this.audit = audit;
	}

	public Set<FoodCategory> getFoodcategory() {
		return foodcategory;
	}

	public void setFoodcategory(Set<FoodCategory> foodcategory) {
		this.foodcategory = foodcategory;
	}
	
}
