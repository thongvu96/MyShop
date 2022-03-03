/**
 * UserService.java
 */
package com.example.thongvu.service;

import com.example.thongvu.entity.User;

/**
 * @author VU HOANG CHI
 *
 */
public interface UserService {

	void save(User user);

    User findByUsername(String username);
}
