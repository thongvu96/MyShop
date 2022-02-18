/**
 * BrandService.java
 */
package com.example.thongvu.service;

import java.util.List;

import com.example.thongvu.vo.BrandVO;

/**
 * @author vuthong
 *
 */
public interface BrandService {

	public List<BrandVO> listBrandVO();
	
	public boolean createBrandVO(BrandVO brandVO);
	
	public BrandVO getBrandById(Integer brandId);
	
	public boolean editBrand(BrandVO brandVO);
	
	public boolean deleteBrand(Integer brandId);
}
