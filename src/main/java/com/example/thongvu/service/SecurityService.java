/**
 * SecurityService.java
 */
package com.example.thongvu.service;

/**
 * @author VU HOANG CHI
 *
 */
public interface SecurityService {

	String findLoggedInUsername();

    void autoLogin(String username, String password);
}
