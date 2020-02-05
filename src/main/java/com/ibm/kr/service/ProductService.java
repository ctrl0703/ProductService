package com.ibm.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ibm.kr.mapper.ProductDAO;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProductMT;
import com.ibm.kr.repository.CategoryRepository;

@Service
@ComponentScan("com.ibm.kr.mapper")
public class ProductService {
	
	@Autowired
	private ProductDAO  productDao;
	
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<ProductMT> getSelectAll() {
		System.out.println("service ");
		return productDao.selectAll();
	}
	
	
	

	public List<Category> getCategories() {
		return categoryRepository.findAllByOrderByOrderAsc();
	}

}
