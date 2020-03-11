package com.ibm.kr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		return productService.getSelectAll();
	}
	
	@GetMapping("/products/category/{id}/{pageStart}/{pageEnd}")
	List<Product> getProductsByCat(@PathVariable("id") String id, @PathVariable("pageStart") int pageStart, @PathVariable("pageEnd") int pageEnd) {
		return productService.getProductsByCat(id, pageStart, pageEnd);
	}
	
	@GetMapping("/category")
	List<Category> getCategories() {
		return productService.getCategoryList(null);
	}

	@GetMapping("/category/depth/{depth}")
	List<Category> getCategoryDepth(@PathVariable("depth") int depth) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("depth", depth);
		return productService.getCategoryList(parameter);
	}
	
	@GetMapping("/category/id/{id}")
	Category getCategoryId(@PathVariable("id") String id) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("id", id);
		return productService.getCategoryList(parameter).get(0);
	}
	
	@GetMapping("/category/superId/{superId}")
	List<Category> getCategorySuperId(@PathVariable("superId") String superId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("superId", superId);
		return productService.getCategoryList(parameter);
	}
	
	@GetMapping("/product/productList/") 
	List<Product> getAllProducts() {
		return productService.getSelectAll();
	}
	
	@GetMapping("/product/{productId}")
	Product getProduct(@PathVariable("productId") String productId) {
		
		return  productService.getProduct(productId);
	}
}
