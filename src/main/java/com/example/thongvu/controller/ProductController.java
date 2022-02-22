/**
 * ProductController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thongvu.service.ProductService;
import com.example.thongvu.vo.ProductVO;

/**
 * @author vuthong
 *
 */
@Controller
@RequestMapping(value = "/admin/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView listProduct(ModelAndView mav) {
		mav.setViewName("listProduct");
		List<ProductVO> listProductVO = productService.listProduct();
		mav.addObject("listProduct", listProductVO);
		return mav;
	}
}
