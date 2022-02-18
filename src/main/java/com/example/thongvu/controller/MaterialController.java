/**
 * MaterialController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.thongvu.service.MaterialService;
import com.example.thongvu.vo.MaterialVO;

/**
 * @author vuthong
 *
 */
@Controller
@RequestMapping(value = "/admin/material")
public class MaterialController {
	
	@Autowired
	MaterialService materialService;
	
	@RequestMapping(value = "/listMaterial", method = RequestMethod.GET)
	public ModelAndView listMaterial(ModelAndView mav) {
		mav.setViewName("listMaterial");
		List<MaterialVO> listMaterialVO = materialService.listMaterial();
		mav.addObject("listMaterial", listMaterialVO);
		return mav;
	}
	
	@RequestMapping(value = "/createMaterial", method = RequestMethod.GET)
	public ModelAndView createMaterial(ModelAndView mav) {
		mav.setViewName("createMaterial");
		mav.addObject("materialVO", new MaterialVO());
		return mav;
	}
	
	@RequestMapping(value = "/createMaterial", method = RequestMethod.POST)
	public ModelAndView createMaterial(@ModelAttribute("materialVO") MaterialVO materialVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = materialService.createMaterial(materialVO);
		if (check) {
			mav.addObject("msg", "Create Success!!!");
			listMaterial(mav);
		} else {
			mav.addObject("msg", "Not yet added. Add again or report to the technical department!");
			createMaterial(mav);
		}
		return mav;
	}
}
