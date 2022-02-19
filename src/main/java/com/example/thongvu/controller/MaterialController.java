/**
 * MaterialController.java
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
	
	@RequestMapping(value = "/editMaterial/{materialId}", method = RequestMethod.GET)
	public ModelAndView editMaterial(@PathVariable(value = "materialId") Integer materialId, ModelAndView mav) {
		mav.setViewName("editMaterial");
		MaterialVO materialVO = materialService.getMaterialById(materialId);
		mav.addObject("materialVO", materialVO);
		return mav;
	}
	
	@RequestMapping(value = "/editMaterial", method = RequestMethod.POST)
	public ModelAndView editMaterial(@ModelAttribute("materialVO") MaterialVO materialVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = materialService.editMaterial(materialVO);
		if (check) {
			mav.addObject("msg", "Edit Success!!!");
			listMaterial(mav);
		} else {
			mav.addObject("msg", "Not yet added. Edit again or report to the technical department!");
			editMaterial(materialVO.getMaterialId(), mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/deleteMaterial/{materialId}", method = RequestMethod.GET)
	public ModelAndView deleteMaterial(@PathVariable(value = "materialId") Integer materialId, ModelAndView mav) {
		mav.setViewName("deleteMaterial");
		MaterialVO materialVO = materialService.getMaterialById(materialId);
		mav.addObject("materialVO", materialVO);
		return mav;
	}
	
	@RequestMapping(value = "/deleteMaterial", method = RequestMethod.POST)
	public ModelAndView deleteMaterial(@ModelAttribute("materialVO") MaterialVO materialVO) {
		ModelAndView mav = new ModelAndView();
		boolean check = materialService.deleteMaterial(materialVO.getMaterialId());
		if (check) {
			mav.addObject("msg", "Delete Success!!!");
			listMaterial(mav);
		} else {
			mav.addObject("msg", "Not yet added. Delete again or report to the technical department!");
			deleteMaterial(materialVO.getMaterialId(), mav);
		}
		return mav;
	}
}
