package com.ibm.kr;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.mapper.ProductDAO;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;

@SpringBootTest
class ProductServiceApplicationTests {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Test
	void getProduct() {
		List<Product> products = productDAO.selectAll();
		for(Product product : products) {
			System.out.println(product);
		}
	}
	
	@Test
	void testCategoryList() {
		List<Category> catetories = productDAO.selectCategory();
		
		for(Category category : catetories) {
			System.out.println(category.toString());
		}
	}

}
