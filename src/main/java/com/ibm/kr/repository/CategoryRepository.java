package com.ibm.kr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.kr.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

	List<Category> findAllByOrderByOrderAsc();

}
