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

}
