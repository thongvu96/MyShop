/**
 * RoleRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thongvu.entity.Role;

/**
 * @author vuthong
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

}
