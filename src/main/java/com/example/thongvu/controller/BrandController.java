/**
 * BrandController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thongvu.service.BrandService;
import com.example.thongvu.vo.BrandVO;

/**
 * @author vuthong
 *
 */
@Controller
public class BrandController {

	@Autowired
	BrandService brandService;
	
	@RequestMapping(value = "/listBrand", method = RequestMethod.GET)
	public ModelAndView listBrand() {
		ModelAndView mav = new ModelAndView("listBrand");
		List<BrandVO> listBrandVO = brandService.listBrandVO();
		mav.addObject("listBrand", listBrandVO);
		return mav;
	}
}
