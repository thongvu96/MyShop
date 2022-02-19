/**
 * CategoryRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thongvu.entity.Category;

/**
 * @author VU HOANG CHI
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
