package com.ibm.kr.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ibm.kr.mapper.ProductDAO;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.Option;
import com.ibm.kr.model.Product;

@Service
@ComponentScan("com.ibm.kr.mapper")
public class ProductService {

	@Autowired
	private ProductDAO productDao;

	// 제품코드를 이용한 검색 
	public Product getProduct(Long prdseq) {	

		Product product = productDao.selectProduct(prdseq);
		if(product != null) {
			List <Option> options = productDao.selectOption(prdseq);
			product.setOptions(options);
		}

		return product;
	}
	
	public List<Product> getProductList(Map<String, Object> parameter) {
		return productDao.selectList(parameter);
	}

	public List<Product> getRelatedProductList(Long prdseq, String id, int pageStart, int pageEnd) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("prdseq", prdseq);
		parameter.put("id", id);
		parameter.put("pageStart", pageStart);
		parameter.put("pageEnd", pageEnd);
		return productDao.selectRelatedProductList(parameter);
	}

	public List<Product> getProductsByCat(String id, int pageStart, int pageEnd) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("id", id);
		parameter.put("pageStart", pageStart);
		parameter.put("pageEnd", pageEnd);
		return productDao.selectProductsByCat(parameter);
	}

	public List<Category> getCategoryList(Map<String, Object> parameter) {
		//json 계층구조 완성된 카테고리
		List<Category> catList = new ArrayList<>();
		//전체 카테고리
		List<Category> catListAll = productDao.selectCategory();
		//Front에서 요청한 카테고리
		List<Category> requestedCatList = productDao.selectCategoryList(parameter);

		if(catListAll.size() == requestedCatList.size()) {
			//전체카테고리요청
			for(int i=0; i < catListAll.size(); i++) {
				if(stringNull(catListAll.get(i).getSuperId()).equals("")) {
					catList.add(catListAll.get(i));
				}
			}
			getSubCategoryList(catList,catListAll);
		} else {
			catList = requestedCatList;
			getSubCategoryList(catList,catListAll);
		}

		return catList;
	}

	public Category getCategory(Map<String, Object> parameter) {
		//전체 카테고리
		List<Category> catListAll = productDao.selectCategory();
		//Front에서 요청한 카테고리
		List<Category> requestedCatList = productDao.selectCategoryList(parameter);
		getSubCategoryList(requestedCatList,catListAll);

		//id는 고유하니까 list는 무조건 1개가 리턴된다는 가정
		return requestedCatList.get(0);
	}

	private void getSubCategoryList(List<Category> catList, List<Category> catListAll){
		for(int i=0; i < catList.size(); i++) {
			List<Category> setSubCatList = new ArrayList<Category>();
			for(int j=0; j < catListAll.size(); j++) {
				if(stringNull(catList.get(i).getId()).equals(stringNull(catListAll.get(j).getSuperId()))) {
					setSubCatList.add(catListAll.get(j));
					getSubCategoryList(setSubCatList,catListAll);
					catList.get(i).setSubCategories(setSubCatList);
				}
			}
		}
	}

	private String stringNull(String str) {
		if(str == null) str = "";
		if(str.isEmpty()) str = "";
		if(str.trim().length() == 0) str="";
		return str;
	}
}
