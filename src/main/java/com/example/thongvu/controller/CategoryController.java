/**
 * CategoryController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/createCategory", method = RequestMethod.GET)
	public ModelAndView createCategory(ModelAndView mav) {
		mav.setViewName("createCategory");
		mav.addObject("categoryVO", new CategoryVO());
		return mav;
	}
	
	@RequestMapping(value = "/createCategory", method = RequestMethod.POST)
	public ModelAndView createCategory(@ModelAttribute("categoryVO") CategoryVO categoryVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = categoryService.createCategory(categoryVO);
		if (check) {
			mav.addObject("msg", "Create Success!!!");
			listCategory(mav);
		} else {
			mav.addObject("msg", "Not yet added. Add again or report to the technical department!");
			createCategory(mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/editCategory/{categoryId}", method = RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable(value = "categoryId") Integer categoryId, ModelAndView mav) {
		mav.setViewName("editCategory");
		CategoryVO categoryVO = categoryService.getCategoryById(categoryId);
		mav.addObject("categoryVO", categoryVO);
		return mav;
	}
	
	@RequestMapping(value = "/editCategory", method = RequestMethod.POST)
	public ModelAndView editCategory(@ModelAttribute("categoryVO") CategoryVO categoryVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = categoryService.editCategory(categoryVO);
		if (check) {
			mav.addObject("msg", "Edit Success!!!");
			listCategory(mav);
		} else {
			mav.addObject("msg", "Not yet added. Edit again or report to the technical department!");
			editCategory(categoryVO.getCategoryId(), mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/deleteCategory/{categoryId}", method = RequestMethod.GET)
	public ModelAndView deleteCategory(@PathVariable(value = "categoryId") Integer categoryId, ModelAndView mav) {
		mav.setViewName("deleteCategory");
		CategoryVO categoryVO = categoryService.getCategoryById(categoryId);
		mav.addObject("categoryVO", categoryVO);
		return mav;
	}
	
	@RequestMapping(value = "/deleteCategory", method = RequestMethod.POST)
	public ModelAndView deleteCategory(@ModelAttribute("categoryVO") CategoryVO categoryVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = categoryService.deleteCategory(categoryVO.getCategoryId());
		if (check) {
			mav.addObject("msg", "Delete Success!!!");
			listCategory(mav);
		} else {
			mav.addObject("msg", "Not yet added. Delete again or report to the technical department!");
			deleteCategory(categoryVO.getCategoryId(), mav);
		}
		return mav;
	}
}
