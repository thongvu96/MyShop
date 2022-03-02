/**
 * UserRepository.java
 */
package com.example.thongvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thongvu.entity.AppUser;

/**
 * @author vuthong
 *
 */
@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {

	AppUser findUserByUsername(String userName);
}
