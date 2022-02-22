/**
 * BrandServiceImpl.java
 */
package com.example.thongvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.BrandDAO;
import com.example.thongvu.entity.Brand;
import com.example.thongvu.service.BrandService;
import com.example.thongvu.vo.BrandVO;

/**
 * @author vuthong
 *
 */
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandDAO brandDAO;
	
	@Override
	public List<BrandVO> listBrandVO() {
		// TODO Auto-generated method stub
		List<BrandVO> listBrandVO = new ArrayList<BrandVO>();
		List<Brand> listBrand = brandDAO.listBrand();
		for (Brand brand : listBrand) {
			BrandVO brandVO = new BrandVO();
			convertPropertiesToDisp(brand, brandVO);
			listBrandVO.add(brandVO);
		}
		return listBrandVO;
	}

	@Override
	public boolean createBrandVO(BrandVO brandVO) {
		// TODO Auto-generated method stub
		Brand brand = new Brand();
		convertPropertiesToDB(brand, brandVO);
		return brandDAO.createBrand(brand);
	}

	@Override
	public boolean editBrand(BrandVO brandVO) {
		// TODO Auto-generated method stub
		Brand brand = new Brand();
		convertPropertiesToDB(brand, brandVO);
		return brandDAO.editBrand(brand);
	}

	@Override
	public BrandVO getBrandById(Integer brandId) {
		// TODO Auto-generated method stub
		BrandVO brandVO = new BrandVO();
		Brand brand = brandDAO.getBrandById(brandId);
		convertPropertiesToDisp(brand, brandVO);
		return brandVO;
	}
	
	public static void convertPropertiesToDisp(Brand brand, BrandVO brandVO) {
		brandVO.setBrandId(brand.getBrandId());
		brandVO.setBrandName(brand.getBrandName());
	}
	
	public static void convertPropertiesToDB(Brand brand, BrandVO brandVO) {
		brand.setBrandId(brandVO.getBrandId());
		brand.setBrandName(brandVO.getBrandName());
	}

	@Override
	public boolean deleteBrand(Integer brandId) {
		// TODO Auto-generated method stub
		return brandDAO.deleteBrand(brandId);
	}

}
