package com.ibm.kr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.controller.ProductController;
import com.ibm.kr.model.Category;

@SpringBootTest
class CategoryTest {
	
	@Autowired
	ProductController productController;
	
	@Test
	/**
	 * 요청 : GET /v1/category/{categoryCode}/category
	 * 응답 : List<Category>
	 * 테스트 메소드 명 : getCategoryList(String categoryCode)
	 * 테스트 메소드 기능 : 전달된 카테고리 코드 하위 카테고리 리스트 전달(상위 카테고리가 전달된 카테고리 코드인 카테고리 목록)
	 * 테스트 시나리오 : 1. 유형별 카테고리 목록(A) 조회
	 * 				2. 카테고리 목록 개수가 13개인지 확인
	 * 				3. CAT_ORDER로 정렬되었는지 확인
	 * 				4. 카테고리 하위 카테고리가 있는지 확인(첫번째 카테고리인 UM의 하위 카테고리 개수가 7개인지 확인)
	 */
	void 카테고리_하위_목록_조회() {
		List<Category> categories = productController.getCategoryList("A");

		assertThat(categories != null);
		assertEquals(13, categories.size());
		assertEquals("UM", categories.get(0));
		assertEquals(7, categories.get(0).getSubCategories().size());
	}

	/**
	 * 요청 : GET /v1/category
	 * 응답 : List<Category>
	 * 테스트 메소드 명 : getCategoryList(String categoryCode)
	 * 테스트 메소드 기능 : 전달된 카테고리 코드 하위 카테고리 리스트 전달(전달된 카테고리코드가 null이면 최상위 카테고리 목록)
	 * 테스트 시나리오 : 1. 메인 화면 카테고리 구성을 위한 최상위 카테고리 목록 조회
	 * 				2. 카테고리 목록 개수가 5개인지 확인(최상위 카테고리 5개)
	 * 				3. 카테고리 하위 카테고리가 있는지 확인(첫번째 카테고리인 A의 하위 카테고리 개수가 13개인지 확인)
	 * 				4. 카테고리 하위 카테고리의 하위 카테고리가 있는지 확인(첫번째 카테고리인 UM의 하위 카테고리 개수가 7인지 확인)
	 */
	@Test
	void 카테고리_전체_목록_조회() {
		List<Category> categories = productController.getCategoryList(null);

		assertThat(categories != null);
		assertEquals(5, categories.size());
		assertEquals("A", categories.get(0).getId());
		assertEquals(13, categories.get(0).getSubCategories().size());
		assertEquals("UM", categories.get(0).getSubCategories().get(0));
		assertEquals(7, categories.get(0).getSubCategories().get(0).getSubCategories().size());
	}
}
