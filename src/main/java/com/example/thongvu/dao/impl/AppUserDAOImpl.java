/**
 * AppUserDAOImpl.java
 */
package com.example.thongvu.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.AppUserDAO;
import com.example.thongvu.entity.AppUser;
import com.example.thongvu.repository.UserRepository;

/**
 * @author vuthong
 *
 */
@Service
public class AppUserDAOImpl implements AppUserDAO {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public AppUser createUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return userRepository.save(appUser);
	}

}
