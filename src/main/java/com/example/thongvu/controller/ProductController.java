/**
 * ProductController.java
 */
package com.example.thongvu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.thongvu.service.BrandService;
import com.example.thongvu.service.CategoryService;
import com.example.thongvu.service.MaterialService;
import com.example.thongvu.service.ProductService;
import com.example.thongvu.vo.BrandVO;
import com.example.thongvu.vo.CategoryVO;
import com.example.thongvu.vo.MaterialVO;
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
	@Autowired
	BrandService brandService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	MaterialService materialService;
	
	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView listProduct(ModelAndView mav) {
		mav.setViewName("listProduct");
		List<ProductVO> listProductVO = productService.listProduct();
		mav.addObject("listProduct", listProductVO);
		return mav;
	}
	
	private Map<Integer, String> listBrand(List<BrandVO> listBrand) {
		Map<Integer, String> mapBrand = new HashMap<Integer, String>();
		for (BrandVO brandVO : listBrand) {
			mapBrand.put(brandVO.getBrandId(), brandVO.getBrandName());
		}
		return mapBrand;
	}
	
	private Map<Integer, String> listCategory(List<CategoryVO> listCategory) {
		Map<Integer, String> mapCategory = new HashMap<Integer, String>();
		for (CategoryVO categoryVO : listCategory) {
			mapCategory.put(categoryVO.getCategoryId(), categoryVO.getCategoryName());
		}
		return mapCategory;
	}
	
	private Map<Integer, String> listMaterial(List<MaterialVO> listMaterial) {
		Map<Integer, String> mapMaterial = new HashMap<Integer, String>();
		for (MaterialVO materialVO : listMaterial) {
			mapMaterial.put(materialVO.getMaterialId(), materialVO.getMaterialName());
		}
		return mapMaterial;
	}
	
	@RequestMapping(value = "/createProduct", method = RequestMethod.GET)
	public ModelAndView createProduct(ModelAndView mav) {
		mav.setViewName("createProduct");
		mav.addObject("productVO", new ProductVO());
		mav.addObject("mapBrand", listBrand(brandService.listBrandVO()));
		mav.addObject("mapCategory", listCategory(categoryService.listCategoryVO()));
		mav.addObject("mapMaterial", listMaterial(materialService.listMaterial()));
		return mav;
	}
	
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public ModelAndView createProduct(@ModelAttribute("productVO") ProductVO productVO) {
		ModelAndView mav = new ModelAndView();
		BrandVO brandVO = brandService.getBrandById(productVO.getProBrand().getBrandId());
		CategoryVO categoryVO = categoryService.getCategoryById(productVO.getProCategory().getCategoryId());
		MaterialVO materialVO = materialService.getMaterialById(productVO.getProMaterial().getMaterialId());
		productVO.setProBrand(brandVO);
		productVO.setProCategory(categoryVO);
		productVO.setProMaterial(materialVO);
		boolean check = productService.createProduct(productVO);
		if (check) {
			mav.addObject("msg", "Create Success!!!");
			listProduct(mav);
		} else {
			mav.addObject("msg", "Not yet added. Add again or report to the technical department!");
			createProduct(mav);
		}
		return mav;
	}
	
	@RequestMapping(value = "/editProduct/{productId}", method = RequestMethod.GET)
	public ModelAndView editProduct(@PathVariable(value = "productId") Integer productId, ModelAndView mav) {
		mav.setViewName("editProduct");
		ProductVO productVO = productService.getProductById(productId);
		mav.addObject("productVO", productVO);
		mav.addObject("mapBrand", listBrand(brandService.listBrandVO()));
		mav.addObject("mapCategory", listCategory(categoryService.listCategoryVO()));
		mav.addObject("mapMaterial", listMaterial(materialService.listMaterial()));
		return mav;
	}
		
	@RequestMapping(value = "/editProduct", method = RequestMethod.POST)
	public ModelAndView editProduct(@ModelAttribute("productVO") ProductVO productVO) {
		ModelAndView mav = new ModelAndView();
		BrandVO brandVO = brandService.getBrandById(productVO.getProBrand().getBrandId());
		CategoryVO categoryVO = categoryService.getCategoryById(productVO.getProCategory().getCategoryId());
		MaterialVO materialVO = materialService.getMaterialById(productVO.getProMaterial().getMaterialId());
		productVO.setProBrand(brandVO);
		productVO.setProCategory(categoryVO);
		productVO.setProMaterial(materialVO);
		boolean check = productService.editProduct(productVO);
		if (check) {
			mav.addObject("msg", "Edit Success!!!");
			listProduct(mav);
		} else {
			mav.addObject("msg", "Not yet added. Edit again or report to the technical department!");
			editProduct(productVO.getProductId(), mav);
		}
		return mav;
	}
	
}
