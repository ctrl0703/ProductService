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
	
	@GetMapping("/products/category/{id}/{pageStart}/{pageEnd}")
	public List<Product> getProductsByCat(@PathVariable("id") String id, @PathVariable("pageStart") int pageStart, @PathVariable("pageEnd") int pageEnd) {
		return productService.getProductsByCat(id, pageStart, pageEnd);
	}
	
	//@GetMapping("/category")
	public List<Category> getCategories() {
		Map<String, Object> parameter = new HashMap<String, Object>();
		return productService.getCategoryList(parameter);
	}

	@GetMapping("/category/depth/{depth}")
	public List<Category> getCategoryDepth(@PathVariable("depth") int depth) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("depth", depth);
		return productService.getCategoryList(parameter);
	}
	
	@GetMapping("/category/id/{id}")
	public Category getCategoryId(@PathVariable("id") String id) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("id", id);
		Category category = productService.getCategoryList(parameter).get(0);
		category.setProducts(productService.getProductsByCat(id, 1, 1));
		return category;
	}
	
	@GetMapping("/category/superId/{superId}")
	public List<Category> getCategorySuperId(@PathVariable("superId") String superId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("superId", superId);
		return productService.getCategoryList(parameter);
	}
	
	@GetMapping("/product/productList/") 
	public List<Product> getAllProducts() {
		return productService.getSelectAll();
	}
	
	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") Long productId) {
		
		return  productService.getProduct(productId);
	}
	
	@GetMapping("/product/{productId}/product")
	public List<Product> getRelatedProducts(@PathVariable Long productId) {
		return null;
	}

	@GetMapping("/category/{categoryCode}/product")
	public List<Product> getCategoryProductList(@PathVariable String categoryCode) {
		return productService.getProductsByCat(categoryCode,1,60);
	}

	@GetMapping(value = {"/category", "/category/{categoryCode}/category"})
	public List<Category> getCategoryList(@PathVariable(value="categoryCode", required=false) String categoryCode) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("superId", categoryCode);
		return productService.getCategoryList(parameter);
	}
}
