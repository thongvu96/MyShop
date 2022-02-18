/**
 * MaterialController.java
 */
package com.example.thongvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public ModelAndView listBrand(ModelAndView mav) {
		mav.setViewName("listMaterial");
		List<MaterialVO> listMaterialVO = materialService.listMaterial();
		mav.addObject("listMaterial", listMaterialVO);
		return mav;
	}
}
