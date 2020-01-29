package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;
import com.ibm.kr.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category/{categoryId}/product")
	public List<Product> getCategoryProducts(@PathVariable("categoryId") String categoryId) {
		return productService.getCategoryProducts(categoryId);
	}
	
	@GetMapping("/category")
	List<Category> getCategories() {
		return productService.getCategories();
	}
}
