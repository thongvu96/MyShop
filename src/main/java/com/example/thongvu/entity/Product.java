/**
 * Product.java
 */
package com.example.thongvu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "product_id", nullable = false)
	private String productDes;
	
	@Column(name = "price", nullable = false)
	private Integer productPrice;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
}
