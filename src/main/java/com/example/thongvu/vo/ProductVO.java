/**
 * ProductVO.java
 */
package com.example.thongvu.vo;

/**
 * @author vuthong
 *
 */
public class ProductVO {

	private Integer productId;
	private String productDes;
	private Integer productPrice;
	private String productName;
	private BrandVO proBrand = new BrandVO();
	private MaterialVO proMaterial = new MaterialVO();
	private CategoryVO proCategory = new CategoryVO();
	
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
	 * @return the proBrand
	 */
	public BrandVO getProBrand() {
		return proBrand;
	}
	/**
	 * @param proBrand the proBrand to set
	 */
	public void setProBrand(BrandVO proBrand) {
		this.proBrand = proBrand;
	}
	/**
	 * @return the proMaterial
	 */
	public MaterialVO getProMaterial() {
		return proMaterial;
	}
	/**
	 * @param proMaterial the proMaterial to set
	 */
	public void setProMaterial(MaterialVO proMaterial) {
		this.proMaterial = proMaterial;
	}
	/**
	 * @return the proCategory
	 */
	public CategoryVO getProCategory() {
		return proCategory;
	}
	/**
	 * @param proCategory the proCategory to set
	 */
	public void setProCategory(CategoryVO proCategory) {
		this.proCategory = proCategory;
	}
		
}
