/**
 * ProductRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thongvu.entity.Product;

/**
 * @author vuthong
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
