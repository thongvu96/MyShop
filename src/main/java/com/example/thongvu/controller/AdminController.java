/**
 * AdminController.java
 */
package com.example.thongvu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author vuthong
 *
 */
@Controller
public class AdminController {

	@RequestMapping(value = { "", "/", "/index" })
	public ModelAndView indexAdmin() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
