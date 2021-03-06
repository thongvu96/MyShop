/**
 * CategoryService.java
 */
package com.example.thongvu.service;

import java.util.List;

import com.example.thongvu.vo.CategoryVO;

/**
 * @author VU HOANG CHI
 *
 */
public interface CategoryService {

	public List<CategoryVO> listCategoryVO();
	
	public boolean createCategory(CategoryVO categoryVO);
	
	public CategoryVO getCategoryById(Integer categoryId);
	
	public boolean editCategory(CategoryVO categoryVO);
	
	public boolean deleteCategory(Integer categoryId);
}
