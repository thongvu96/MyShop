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

}