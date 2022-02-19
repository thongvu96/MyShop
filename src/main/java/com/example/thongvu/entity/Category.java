/**
 * Category.java
 */
package com.example.thongvu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VU HOANG CHI
 *
 */
@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "category_description")
	private String categoryDes;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDes() {
		return categoryDes;
	}

	public void setCategoryDes(String categoryDes) {
		this.categoryDes = categoryDes;
	}
	
}
