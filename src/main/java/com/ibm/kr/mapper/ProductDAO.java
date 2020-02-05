package com.ibm.kr.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.ProductMT;


@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ProductMT> selectAll() 
	{
		return sqlSession.selectList("com.ibm.kr.product.selectProdMT");
	}
	
}
