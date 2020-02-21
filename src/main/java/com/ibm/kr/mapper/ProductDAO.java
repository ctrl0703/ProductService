package com.ibm.kr.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.Category;
import com.ibm.kr.model.ProdCatID;
import com.ibm.kr.model.Product;


@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<Product> selectAll() 
	{
		return sqlSession.selectList("com.ibm.kr.product.selectAll");
	}
	
	public List<Category> selectCategory() 
	{
		return sqlSession.selectList("com.ibm.kr.product.selectCategory");
	}
	
	public Product selectProduct(String prdseq) {
		
		
		return sqlSession.selectOne("com.ibm.kr.product.selectProduct",prdseq);
	}

	public List<Category> selectCategoryList(Category category) {
		return sqlSession.selectList("com.ibm.kr.product.selectCategoryList", category);
	}
	
	public List<Product> selectProductCatRel(ProdCatID prodcatrel) {
		return sqlSession.selectList("com.ibm.kr.product.selectProductCatRel", prodcatrel);
	}
	
	

}
