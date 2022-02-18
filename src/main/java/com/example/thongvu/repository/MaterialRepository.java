/**
 * MaterialRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thongvu.entity.Material;

/**
 * @author vuthong
 *
 */
@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
