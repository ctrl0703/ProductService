package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProdCatRel;
import com.ibm.kr.model.Product;
import com.ibm.kr.model.ProductMT;
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
	List<ProdCatRel> getProductsByCat(@PathVariable("id") String id, @PathVariable("pageStart") int pageStart, @PathVariable("pageEnd") int pageEnd) {
		ProdCatRel prodCatRel = new ProdCatRel();
		prodCatRel.setId(id);
		prodCatRel.setPageStart(pageStart);
		prodCatRel.setPageEnd(pageEnd);
		return productService.getProductsByCat(prodCatRel);
	}
	
	@GetMapping("/category")
	List<Category> getCategories() {
		Category category = new Category();
		return productService.getCategoryList(category);
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
	
	@GetMapping("/category/depth/{depth}/id/{id}")
	Category getCategoryDepthId(@PathVariable("depth") int depth, @PathVariable("id") String id) {
		Category category = new Category();
		category.setDepth(depth);
		category.setId(id);
		return productService.getCategoryList(category).get(0);
	}
	
	@GetMapping("/category/id/{id}")
	Category getCategoryId(@PathVariable("id") String id) {
		Category category = new Category();
		category.setId(id);
		return productService.getCategoryList(category).get(0);
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
	
}
