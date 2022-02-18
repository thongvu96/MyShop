/**
 * BrandDAOImpl.java
 */
package com.example.thongvu.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.BrandDAO;
import com.example.thongvu.entity.Brand;
import com.example.thongvu.repository.BrandRepository;

/**
 * @author vuthong
 *
 */
@Service
public class BrandDAOImpl implements BrandDAO {

	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public List<Brand> listBrand() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public boolean createBrand(Brand brand) {
		// TODO Auto-generated method stub
		try {
			brandRepository.save(brand);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

	@Override
	public boolean editBrand(Brand brand) {
		// TODO Auto-generated method stub
		try {
			brandRepository.save(brand);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

	@Override
	public Brand getBrandById(Integer brandId) {
		// TODO Auto-generated method stub
		return brandRepository.getById(brandId);
	}

	@Override
	public boolean deleteBrand(Integer brandId) {
		// TODO Auto-generated method stub
		try {
			brandRepository.deleteById(brandId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

}
