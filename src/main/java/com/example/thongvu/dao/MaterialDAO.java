/**
 * MaterialDAO.java
 */
package com.example.thongvu.dao;

import java.util.List;

import com.example.thongvu.entity.Material;

/**
 * @author vuthong
 *
 */
public interface MaterialDAO {

	public List<Material> listMaterial();
	
	public boolean createMaterial(Material material);
	
	public Material getMaterialById(Integer materialId);
	
	public boolean editMaterial(Material material);
}
