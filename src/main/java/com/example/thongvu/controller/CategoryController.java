/**
 * CategoryController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thongvu.service.CategoryService;
import com.example.thongvu.vo.BrandVO;
import com.example.thongvu.vo.CategoryVO;

/**
 * @author VU HOANG CHI
 *
 */
@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/listCategory", method = RequestMethod.GET)
	public ModelAndView listCategory(ModelAndView mav) {
		mav.setViewName("listCategory");
		List<CategoryVO> listCategoryVO = categoryService.listCategoryVO();
		mav.addObject("listCategory", listCategoryVO);
		return mav;
	}
}
