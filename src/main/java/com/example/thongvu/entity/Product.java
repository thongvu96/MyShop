/**
 * Product.java
 */
package com.example.thongvu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vuthong
 *
 */
@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	@Column(name = "product_description", nullable = false)
	private String productDes;
	
	@Column(name = "price", nullable = false)
	private Integer productPrice;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@ManyToOne
	@JoinColumn(name = "brand_id", nullable = false)
	private Brand brand = new Brand();
	
	@ManyToOne
	@JoinColumn(name = "material_id", nullable = false)
	private Material material = new Material();
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category = new Category();

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * @return the productDes
	 */
	public String getProductDes() {
		return productDes;
	}

	/**
	 * @param productDes the productDes to set
	 */
	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}

	/**
	 * @return the productPrice
	 */
	public Integer getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
