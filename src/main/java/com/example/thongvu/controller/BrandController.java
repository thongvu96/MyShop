/**
 * BrandController.java
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

import com.example.thongvu.service.BrandService;
import com.example.thongvu.vo.BrandVO;

/**
 * @author vuthong
 *
 */
@Controller
@RequestMapping(value = "/admin/brand")
public class BrandController {

	@Autowired
	BrandService brandService;
	
	@RequestMapping(value = "/listBrand", method = RequestMethod.GET)
	public ModelAndView listBrand(ModelAndView mav) {
		mav.setViewName("listBrand");
		List<BrandVO> listBrandVO = brandService.listBrandVO();
		mav.addObject("listBrand", listBrandVO);
		return mav;
	}
	
	@RequestMapping(value = "/createBrand", method = RequestMethod.GET)
	public ModelAndView createBrand(ModelAndView mav) {
		mav.setViewName("createBrand");
		mav.addObject("brandVO", new BrandVO());
		return mav;
	}
	
	@RequestMapping(value = "/createBrand", method = RequestMethod.POST)
	public ModelAndView createBrand(@ModelAttribute("brandVO") BrandVO brandVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = brandService.createBrandVO(brandVO);
		if (check) {
			mav.addObject("msg", "Create Success!!!");
			listBrand(mav);
		} else {
			mav.addObject("msg", "Not yet added. Add again or report to the technical department!");
			createBrand(mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/editBrand/{brandId}", method = RequestMethod.GET)
	public ModelAndView editBrand(@PathVariable(value = "brandId") Integer brandId, ModelAndView mav) {
		mav.setViewName("editBrand");
		BrandVO brandVO = brandService.getBrandById(brandId);
		mav.addObject("brandVO", brandVO);
		return mav;
	}
	
	@RequestMapping(value = "/editBrand", method = RequestMethod.POST)
	public ModelAndView editBrand(@ModelAttribute("brandVO") BrandVO brandVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = brandService.editBrand(brandVO);
		if (check) {
			mav.addObject("msg", "Edit Success!!!");
			listBrand(mav);
		} else {
			mav.addObject("msg", "Not yet added. Edit again or report to the technical department!");
			editBrand(brandVO.getBrandId(), mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/deleteBrand/{brandId}", method = RequestMethod.GET)
	public ModelAndView deleteBrand(@PathVariable(value = "brandId") Integer brandId, ModelAndView mav) {
		mav.setViewName("deleteBrand");
		BrandVO brandVO = brandService.getBrandById(brandId);
		mav.addObject("brandVO", brandVO);
		return mav;
	}
	
	@RequestMapping(value = "/deleteBrand", method = RequestMethod.POST)
	public ModelAndView deleteBrand(@ModelAttribute("brandVO") BrandVO brandVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = brandService.deleteBrand(brandVO.getBrandId());
		if (check) {
			mav.addObject("msg", "Delete Success!!!");
			listBrand(mav);
		} else {
			mav.addObject("msg", "Not yet added. Delete again or report to the technical department!");
			deleteBrand(brandVO.getBrandId(), mav);
		}
		return mav;
	}
}
