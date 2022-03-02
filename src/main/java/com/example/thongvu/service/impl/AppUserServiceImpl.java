/**
 * AppUserServiceImpl.java
 */
package com.example.thongvu.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.thongvu.dao.AppUserDAO;
import com.example.thongvu.entity.AppUser;
import com.example.thongvu.service.AppUserService;
import com.example.thongvu.vo.AppUserVO;

/**
 * @author vuthong
 *
 */
@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	AppUserDAO appUserDAO;
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean createAppUser(AppUserVO appUserVO) {
		// TODO Auto-generated method stub
		AppUser appUser = new AppUser();
		appUser.setUserId(appUserVO.getUserId());
		appUser.setUserName(appUserVO.getUserName());
		appUser.setUserPass(appUserVO.getUserPass());
		appUser.setEncrytedPassword(passwordEncoder.encode(appUserVO.getUserPass()));
		if (appUserDAO.createUser(appUser) != null) {
			return true;
		}
		return false;
	}

}
