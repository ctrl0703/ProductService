package com.ibm.kr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.Page;
import com.ibm.kr.model.Product;
import com.ibm.kr.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") Long productId) {
		return productService.getProduct(productId);
	}
	
	@GetMapping("/product")
	public List<Product> searchProduct(@RequestParam Map<String, Object> reqParam) {
		return productService.getProductList(reqParam);
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

	@GetMapping("/category/{categoryCode}")
	public Category getCategory(@PathVariable String categoryCode) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("id", categoryCode);
		return productService.getCategory(parameter);
	}

	@GetMapping("/product/{productId}/category/{categoryCode}/product")
	public List<Product> getRelatedProductList(@PathVariable Long productId, @PathVariable String categoryCode) {
		return productService.getRelatedProductList(productId,categoryCode,1,60);
	}

	@GetMapping("/category/{categoryCode}/pagingProduct")
	public Page<Product> getCategoryProductListByPage(@PathVariable String categoryCode, @RequestParam Map<String, Object> reqParam) {
		return productService.getCategoryProductListByPage(categoryCode, reqParam);
	}
}
