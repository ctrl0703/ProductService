package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProdCatID;
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
	
	@GetMapping("/category")
	List<Category> getCategories() {
		return productService.getCategories();
	}

	@GetMapping("/category/depth/{depth}")
	List<Category> getCategoryDepth(@PathVariable("depth") int depth) {
		Category category = new Category();
		category.setDepth(depth);
		return productService.getCategoryList(category);
	}
	
	@GetMapping("/category/depth/{depth}/{order}")
	List<Category> getCategoryOne(@PathVariable("depth") int depth, @PathVariable("order") int order) {
		Category category = new Category();
		category.setDepth(depth);
		category.setOrder(order);
		return productService.getCategoryList(category);
	}
	
	@GetMapping("/category/id/{id}")
	List<Category> getCategoryId(@PathVariable("id") String id) {
		Category category = new Category();
		category.setId(id);
		return productService.getCategoryList(category);
	}
	
	@GetMapping("/category/superId/{superId}")
	List<Category> getCategorySuperId(@PathVariable("superId") String superId) {
		Category category = new Category();
		category.setSuperId(superId);
		return productService.getCategoryList(category);
	}
	
	@GetMapping("/product/productList/") 
	List<Product> getAllProducts() {
		return productService.getSelectAll();
	}
	
	@GetMapping("/product/{productId}")
	Product getProduct(@PathVariable("productId") String productId) {
		
		return  productService.getProduct(productId);
	}
	
	@PutMapping("/product/catrel/B")
	List<Product> getProductListCatRel(@RequestBody ProdCatID prodCatId) { 
		
		return  productService.getProductListCatRel(prodCatId);
	}
}
