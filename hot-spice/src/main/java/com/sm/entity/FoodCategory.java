package com.sm.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="food_category")
public class FoodCategory implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cat_id", columnDefinition="int", nullable=false)
	private int catId;

	@Column(name="cat_name")
	private String catName;

	private String description;

	@Embedded
	AuditDetails audit;

	/*@OneToMany(mappedBy="foodCategory" ,fetch = FetchType.EAGER, cascade=CascadeType.ALL, targetEntity=FoodItmFoodCategoryMap.class)
	Set<FoodItmFoodCategoryMap> foodItemCategoryMap = new HashSet<FoodItmFoodCategoryMap>();*/
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name="food_item_cat_map", joinColumns={@JoinColumn(name="cat_id",nullable=false)},
	inverseJoinColumns={@JoinColumn(name="item_id", nullable=false)})
	Set<FoodItem> fooditem = new HashSet<FoodItem>();

	public FoodCategory() {
		super();
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AuditDetails getAudit() {
		return audit;
	}

	public void setAudit(AuditDetails audit) {
		this.audit = audit;
	}

	public Set<FoodItem> getFooditem() {
		return fooditem;
	}

	public void setFooditem(Set<FoodItem> fooditem) {
		this.fooditem = fooditem;
	}
	
}
