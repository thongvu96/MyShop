/**
 * BrandDAO.java
 */
package com.example.thongvu.dao;

import java.util.List;

import com.example.thongvu.entity.Brand;

/**
 * @author vuthong
 *
 */
public interface BrandDAO {

	public List<Brand> listBrand();
	
	public boolean createBrand(Brand brand);
	
	public Brand getBrandById(Integer brandId);
	
	public boolean editBrand(Brand brand);
	
	public boolean deleteBrand(Integer brandId);
}
