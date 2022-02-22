/**
 * ProductDAOImpl.java
 */
package com.example.thongvu.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.ProductDAO;
import com.example.thongvu.entity.Product;
import com.example.thongvu.repository.ProductRepository;

/**
 * @author vuthong
 *
 */
@Service
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
