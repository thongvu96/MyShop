/**
 * CategoryDAO.java
 */
package com.example.thongvu.dao;

import java.util.List;

import com.example.thongvu.entity.Category;

/**
 * @author VU HOANG CHI
 *
 */
public interface CategoryDAO {

	public List<Category> listCategory();
	
	public boolean createCategory(Category category);
	
	public Category getCategoryById(Integer categoryId);
	
	public boolean editCategory(Category category);
	
	public boolean deleteCategory(Integer categoryId);
}
