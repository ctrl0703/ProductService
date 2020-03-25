package com.ibm.kr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.Option;
import com.ibm.kr.model.Product;


@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<Product> selectAll() {
		return sqlSession.selectList("com.ibm.kr.product.selectAll");
	}
	
	public List<Category> selectCategory() {
		return sqlSession.selectList("com.ibm.kr.product.selectCategory");
	}
	
	public Product selectProduct(Long prdseq) {
		return sqlSession.selectOne("com.ibm.kr.product.selectProduct", prdseq);
	}
	
	public List<Option> selectOption(Long prdseq) {
		return sqlSession.selectList("com.ibm.kr.product.selectOption", prdseq);
	}
	
	public List<Product> selectProductsByCat(Map<String, Object> parameter) {
		return sqlSession.selectList("com.ibm.kr.product.selectProductsByCat", parameter);
	}

	public List<Category> selectCategoryList(Map<String, Object> parameter) {
		return sqlSession.selectList("com.ibm.kr.product.selectCategoryList", parameter);
	}
}
