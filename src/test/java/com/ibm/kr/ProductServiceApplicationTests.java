package com.ibm.kr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("name", "트루케어");
		List<Product> products = productDAO.selectList(parameter);
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
