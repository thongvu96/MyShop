/**
 * CategoryServiceImpl.java
 */
package com.example.thongvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.CategoryDAO;
import com.example.thongvu.entity.Category;
import com.example.thongvu.service.CategoryService;
import com.example.thongvu.vo.CategoryVO;

/**
 * @author VU HOANG CHI
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO categoryDAO;
	
	@Override
	public List<CategoryVO> listCategoryVO() {
		// TODO Auto-generated method stub
		List<CategoryVO> listCategoryVO = new ArrayList<CategoryVO>();
		List<Category> listCategory = categoryDAO.listCategory();
		for (Category category : listCategory) {
			CategoryVO categoryVO = new CategoryVO();
			convertPropertiesToDisp(category, categoryVO);
			listCategoryVO.add(categoryVO);
		}
		return listCategoryVO;
	}
	
	public static void convertPropertiesToDisp(Category category, CategoryVO categoryVO) {
		categoryVO.setCategoryId(category.getCategoryId());
		categoryVO.setCategoryName(category.getCategoryName());
		categoryVO.setCategoryDes(category.getCategoryDes());
	}

	@Override
	public boolean createCategory(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		Category category = new Category();
		convertPropertiesToDB(category, categoryVO);
		return categoryDAO.createCategory(category);
	}
	
	public static void convertPropertiesToDB(Category category, CategoryVO categoryVO) {
		category.setCategoryId(categoryVO.getCategoryId());
		category.setCategoryName(categoryVO.getCategoryName());
		category.setCategoryDes(categoryVO.getCategoryDes());
	}

	@Override
	public CategoryVO getCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		Category category = categoryDAO.getCategoryById(categoryId);
		CategoryVO categoryVO = new CategoryVO();
		convertPropertiesToDisp(category, categoryVO);
		return categoryVO;
	}

	@Override
	public boolean editCategory(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		Category category = new Category();
		convertPropertiesToDB(category, categoryVO);
		return categoryDAO.editCategory(category);
	}

	@Override
	public boolean deleteCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return categoryDAO.deleteCategory(categoryId);
	}
	
}
