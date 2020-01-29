package com.ibm.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;
import com.ibm.kr.repository.CategoryRepository;
import com.ibm.kr.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Product> getCategoryProducts(String categoryId) {
		return productRepository.findByCategoryId(categoryId);
	}

	public List<Category> getCategories() {
		return categoryRepository.findAllByOrderByOrderAsc();
	}

}
