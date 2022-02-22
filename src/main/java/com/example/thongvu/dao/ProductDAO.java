/**
 * ProductDAO.java
 */
package com.example.thongvu.dao;

import java.util.List;

import com.example.thongvu.entity.Product;

/**
 * @author vuthong
 *
 */
public interface ProductDAO {

	public List<Product> listProduct();
	
	public boolean createProduct(Product product);
}
