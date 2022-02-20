/**
 * CategoryDAOImpl.java
 */
package com.example.thongvu.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.CategoryDAO;
import com.example.thongvu.entity.Category;
import com.example.thongvu.repository.CategoryRepository;

/**
 * @author VU HOANG CHI
 *
 */
@Service
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> listCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public boolean createCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			categoryRepository.save(category);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

	@Override
	public Category getCategoryById(Integer categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.getById(categoryId);
	}

	@Override
	public boolean editCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			categoryRepository.save(category);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		try {
			categoryRepository.deleteById(categoryId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

}
