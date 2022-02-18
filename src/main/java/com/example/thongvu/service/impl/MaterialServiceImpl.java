/**
 * MaterialServiceImpl.java
 */
package com.example.thongvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.MaterialDAO;
import com.example.thongvu.entity.Material;
import com.example.thongvu.service.MaterialService;
import com.example.thongvu.vo.MaterialVO;

/**
 * @author vuthong
 *
 */
@Service
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	MaterialDAO materialDAO;
	@Override
	public List<MaterialVO> listMaterial() {
		// TODO Auto-generated method stub
		List<MaterialVO> listMaterialVO = new ArrayList<MaterialVO>();
		List<Material> listMaterial = materialDAO.listMaterial();
		for (Material material : listMaterial) {
			MaterialVO materialVO = new MaterialVO();
			convertPropertiesToDisp(material, materialVO);
			listMaterialVO.add(materialVO);
		}
		return listMaterialVO;
	}
	
	private void convertPropertiesToDisp(Material material, MaterialVO materialVO) {
		materialVO.setMaterialId(material.getMaterialId());
		materialVO.setMaterialName(material.getMaterialName());
	}

}
