/**
 * ProductServiceImpl.java
 */
package com.example.thongvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.ProductDAO;
import com.example.thongvu.entity.Product;
import com.example.thongvu.service.ProductService;
import com.example.thongvu.vo.ProductVO;

/**
 * @author vuthong
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public List<ProductVO> listProduct() {
		// TODO Auto-generated method stub
		List<ProductVO> listProductVO = new ArrayList<ProductVO>();
		List<Product> listProduct = productDAO.listProduct();
		for (Product product : listProduct) {
			ProductVO productVO = new ProductVO();
			convertToDisp(product, productVO);
			listProductVO.add(productVO);
		}
		return listProductVO;
	}

	private void convertToDisp(Product product, ProductVO productVO) {
		productVO.setProductId(product.getProductId());
		productVO.setProductName(product.getProductName());
		productVO.setProductPrice(product.getProductPrice());
		productVO.setProductDes(product.getProductDes());
		BrandServiceImpl.convertPropertiesToDisp(product.getBrand(), productVO.getProBrand());
		MaterialServiceImpl.convertPropertiesToDisp(product.getMaterial(), productVO.getProMaterial());
		CategoryServiceImpl.convertPropertiesToDisp(product.getCategory(), productVO.getProCategory());
	}
	
	
}
