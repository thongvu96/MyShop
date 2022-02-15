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
			brandVO.setBrandId(brand.getBrandId());
			brandVO.setBrandName(brand.getBrandName());
			listBrandVO.add(brandVO);
		}
		return listBrandVO;
	}

}
