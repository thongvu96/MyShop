/**
 * MaterialDAOImpl.java
 */
package com.example.thongvu.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.MaterialDAO;
import com.example.thongvu.entity.Material;
import com.example.thongvu.repository.MaterialRepository;

/**
 * @author vuthong
 *
 */
@Service
public class MaterialDAOImpl implements MaterialDAO {

	@Autowired
	MaterialRepository materialRepository;
	@Override
	public List<Material> listMaterial() {
		// TODO Auto-generated method stub
		return materialRepository.findAll();
	}
	@Override
	public boolean createMaterial(Material material) {
		// TODO Auto-generated method stub
		try {
			materialRepository.save(material);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}
	@Override
	public Material getMaterialById(Integer materialId) {
		// TODO Auto-generated method stub
		return materialRepository.getById(materialId);
	}
	@Override
	public boolean editMaterial(Material material) {
		// TODO Auto-generated method stub
		try {
			materialRepository.save(material);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}
	@Override
	public boolean deleteMaterial(Integer materialId) {
		// TODO Auto-generated method stub
		try {
			materialRepository.deleteById(materialId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

}
