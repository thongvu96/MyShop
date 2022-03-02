/**
 * AppUser.java
 */
package com.example.thongvu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author vuthong
 *
 */
@Entity
@Table(name = "app_user")
public class AppUser {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name = "user_name", unique = true, nullable = false)
	private String userName;
	
	@Column(name = "user_pass")
	private String userPass;
	
	@Column(name = "encryted_password")
	private String encrytedPassword;
	
	@Column(name = "enabled")
	private char enabled;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
	private Set<AppRole> appRoles = new HashSet<AppRole>();
	
	/**
	 * @return the appRoles
	 */
	public Set<AppRole> getAppRoles() {
		return appRoles;
	}

	/**
	 * @param appRoles the appRoles to set
	 */
	public void setAppRoles(Set<AppRole> appRoles) {
		this.appRoles = appRoles;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPass
	 */
	public String getUserPass() {
		return userPass;
	}

	/**
	 * @param userPass the userPass to set
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	/**
	 * @return the encrytedPassword
	 */
	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	/**
	 * @param encrytedPassword the encrytedPassword to set
	 */
	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	/**
	 * @return the enabled
	 */
	public char getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}
	
}
