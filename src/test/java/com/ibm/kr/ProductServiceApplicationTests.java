package com.ibm.kr;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;
import com.ibm.kr.repository.CategoryRepository;
import com.ibm.kr.service.ProductService;

@SpringBootTest
class ProductServiceApplicationTests {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Test
	void testGetCategoryProducts() {
		List<Product> products = productService.getCategoryProducts("A");
		
		for(Product product : products) {
			System.out.println(product.toString());
		}
	}
	
	@Test
	void testCategoryList() {
		List<Category> catetories = categoryRepository.findAllByOrderByOrderAsc();
		
		for(Category category : catetories) {
			System.out.println(category.toString());
		}
	}

}
