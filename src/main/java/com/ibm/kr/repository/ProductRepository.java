package com.ibm.kr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
//	public List<Product> findByCategoryId(String categoryId); 
}
