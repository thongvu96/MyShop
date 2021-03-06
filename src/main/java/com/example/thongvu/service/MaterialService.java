/**
 * MaterialService.java
 */
package com.example.thongvu.service;

import java.util.List;

import com.example.thongvu.vo.MaterialVO;

/**
 * @author vuthong
 *
 */
public interface MaterialService {
	
	public List<MaterialVO> listMaterial();
	
	public boolean createMaterial(MaterialVO materialVO);
	
	public MaterialVO getMaterialById(Integer materialId);
	
	public boolean editMaterial(MaterialVO materialVO);
	
	public boolean deleteMaterial(Integer materialId);
}
