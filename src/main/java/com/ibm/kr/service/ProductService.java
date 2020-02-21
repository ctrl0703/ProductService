package com.ibm.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ibm.kr.mapper.ProductDAO;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProdCatID;
import com.ibm.kr.model.Product;
import com.ibm.kr.repository.CategoryRepository;

@Service
@ComponentScan("com.ibm.kr.mapper")
public class ProductService {
	
	@Autowired
	private ProductDAO  productDao;
	
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Product> getSelectAll() {
		return productDao.selectAll();
	}
	
	

	public List<Category> getCategories() {
		return productDao.selectCategory();
	}
	
	// 제품코드를 이용한 검색 
	public Product getProduct(String prdseq) {
		
		
		return productDao.selectProduct(prdseq);
	}
	
	public List<Category> getCategoryList(Category category) {
		return productDao.selectCategoryList(category);
	}
	
	public List<Category> getCategoryId(Category category) {
		List<Category> CategoryIdList = null;
		
		return null;
	}
	
	public List<Product> getProductListCatRel(ProdCatID prodCatId){
		
		return productDao.selectProductCatRel(prodCatId);
	}
	

}
