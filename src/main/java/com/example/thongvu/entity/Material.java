/**
 * Material.java
 */
package com.example.thongvu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author vuthong
 *
 */
@Entity
@Table(name = "material")
public class Material {

	@Id
	@Column(name = "material_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer materialId;
	
	@Column(name = "material_name", nullable = false)
	private String materialName;
	
	@OneToMany(mappedBy = "material")
	private List<Product> listProduct;

	/**
	 * @return the listProduct
	 */
	public List<Product> getListProduct() {
		return listProduct;
	}

	/**
	 * @param listProduct the listProduct to set
	 */
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	/**
	 * @return the materialId
	 */
	public Integer getMaterialId() {
		return materialId;
	}

	/**
	 * @param materialId the materialId to set
	 */
	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	/**
	 * @return the materialName
	 */
	public String getMaterialName() {
		return materialName;
	}

	/**
	 * @param materialName the materialName to set
	 */
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
}
