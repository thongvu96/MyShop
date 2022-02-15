/**
 * BrandRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thongvu.entity.Brand;

/**
 * @author vuthong
 *
 */
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
