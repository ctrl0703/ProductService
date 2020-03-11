package com.ibm.kr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ibm.kr.mapper.ProductDAO;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;

@Service
@ComponentScan("com.ibm.kr.mapper")
public class ProductService {
	
	@Autowired
	private ProductDAO  productDao;
	
	public List<Product> getSelectAll() {
		return productDao.selectAll();
	}
	
	public List<Category> getCategories() {
		return productDao.selectCategory();
	}
	
	// 제품코드를 이용한 검색 
	public Product getProduct(Long prdseq) {	
		return productDao.selectProduct(prdseq);
	}
	
	public List<Product> getProductsByCat(String id, int pageStart, int pageEnd) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("id", id);
		parameter.put("pageStart", pageStart);
		parameter.put("pageEnd", pageEnd);
		return productDao.selectProductsByCat(parameter);
	}
	
	public List<Category> getCategoryList(Map<String, Object> parameter) {
		return productDao.selectCategoryList(parameter);
	}
	
}
