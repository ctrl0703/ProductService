package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProductMT;
import com.ibm.kr.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category/{categoryId}/product")
	public List<ProductMT> getCategoryProducts(@PathVariable("categoryId") String categoryId) {
		
		return productService.getSelectAll();
	}
	
	@GetMapping("/category")
	List<Category> getCategories() {
		return productService.getCategories();
	}
	
	
	
	@GetMapping("/product/productList/")
	List<ProductMT> getAllProducts() {
		return productService.getSelectAll();
	}
}
