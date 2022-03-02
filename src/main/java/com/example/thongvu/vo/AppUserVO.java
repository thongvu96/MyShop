/**
 * AppUserVO.java
 */
package com.example.thongvu.vo;

/**
 * @author vuthong
 *
 */
public class AppUserVO {

	private Integer userId;
	private String userName;
	private String userPass;
	private String encrytedPassword;
	private char enabled;
	
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
