/**
 * ProductService.java
 */
package com.example.thongvu.service;

import java.util.List;

import com.example.thongvu.vo.ProductVO;

/**
 * @author vuthong
 *
 */
public interface ProductService {
	
	public List<ProductVO> listProduct();
	
	public boolean createProduct(ProductVO productVO);
	
	public ProductVO getProductById(Integer productId);
	
	public boolean editProduct(ProductVO productVO);
	
	public boolean deleteProduct(Integer productId);
}
