package com.ssafy.product.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.ssafy.product.model.ProductDto;
import com.ssafy.product.model.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("regist")
	public String regist() {
		System.out.println("여기왓지?");
		return "regist";
	}
	
	@GetMapping("/list")
	public ModelAndView list() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<ProductDto> list = productService.listProduct();
		mav.addObject("products", list);
		mav.setViewName("product/list");
		return mav;
	}
}
