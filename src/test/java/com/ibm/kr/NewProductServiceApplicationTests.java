package com.ibm.kr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.controller.ProductController;
import com.ibm.kr.model.Category;
import com.ibm.kr.model.Product;

@SpringBootTest
class NewProductServiceApplicationTests {
	
	@Autowired
	ProductController productController;
	
	@Test
	/**
	 * 요청 : GET /v1/category/{categoryCode}/category
	 * 응답 : List<Category>
	 * 테스트 메소드 명 : getCategoryList(String categoryCode)
	 * 테스트 메소드 기능 : 전달된 카테고리 코드 하위 카테고리 리스트 전달(상위 카테고리가 전달된 카테고리 코드인 카테고리 목록)
	 * 테스트 시나리오 : 1. 유형별 카테고리 목록(A) 조회
	 * 				2. 카테고리 목록 개수가 12개인지 확인
	 * 				3. CAT_ORDER로 정렬되었는지 확인
	 * 				4. 카테고리 하위 카테고리가 있는지 확인(첫번째 카테고리인 UM의 하위 카테고리 개수가 7개인지 확인)
	 */
	void 카테고리_하위_목록_조회() {
		List<Category> categories = productController.getCategoryList("A");

		assertThat(categories != null);
		assertEquals(12, categories.size());
		assertEquals("UM", categories.get(0).getId());
		assertEquals(7, categories.get(0).getSubCategories().size());
	}

	/**
	 * 요청 : GET /v1/category
	 * 응답 : List<Category>
	 * 테스트 메소드 명 : getCategoryList(String categoryCode)
	 * 테스트 메소드 기능 : 전달된 카테고리 코드 하위 카테고리 리스트 전달(전달된 카테고리코드가 null이면 최상위 카테고리 목록)
	 * 테스트 시나리오 : 1. 메인 화면 카테고리 구성을 위한 최상위 카테고리 목록 조회
	 * 				2. 카테고리 목록 개수가 5개인지 확인(최상위 카테고리 5개)
	 * 				3. 카테고리 하위 카테고리가 있는지 확인(첫번째 카테고리인 A의 하위 카테고리 개수가 12개인지 확인)
	 * 				4. 첫번째 카테고리 A의 첫번째 서브카테고리 명이 UM이 맞는지 확인
	 * 				5. 카테고리 하위 카테고리의 하위 카테고리가 있는지 확인(첫번째 카테고리인 UM의 하위 카테고리 개수가 7인지 확인)
	 */
	@Test
	void 카테고리_전체_목록_조회() {
		List<Category> categories = productController.getCategoryList(null);

		assertThat(categories != null);
		assertEquals(5, categories.size());
		assertEquals("A", categories.get(0).getId());
		assertEquals(12, categories.get(0).getSubCategories().size());
		assertEquals("UM", categories.get(0).getSubCategories().get(0).getId());
		assertEquals(7, categories.get(0).getSubCategories().get(0).getSubCategories().size());
	}

	/**
	 * 요청 : GET /v1/product/{productId}
	 * 응답 : Product
	 * 테스트 메소드 명 : getProduct(Long productId)
	 * 테스트 메소드 기능 : 전달된 제품 코드의 상세 정보 조회
	 * 테스트 시나리오 : 1. 11266으로 제품 검색 요청
	 * 				2. 검색된 제품의 이름이 맞는지 확인
	 * 				3. 검색된 제품의 가격이 맞는지 확인
	 * 				4. 검색된 제품의 파일명이 맞는지 확인
	 * 				5. 검색된 제품의 옵션이 없는지 확인(원래 11266은 옵션이 없음)
	 * 				6. 옵션이 있는 제품의 옵션이 있는지 확인(16377 제품의 옵션 수는 10개)
	 */
	@Test
	void 제품_상세정보_조회() {
		Product productNoOption = productController.getProduct(11266L);
		
		assertEquals(11266L, productNoOption.getId());
		assertEquals("알로에 리바이탈 스킨 미스트", productNoOption.getName());
		assertEquals(new BigDecimal("10000"), productNoOption.getPrice());
		assertEquals("알로에-리바이탈-스킨미스트_450.png", productNoOption.getImageUrl());
		assertEquals(0, productNoOption.getOptions().size());
		
		Product productWithOption = productController.getProduct(16377L);
		assertEquals(10, productWithOption.getOptions().size());
	}
	
	/**
	 * 요청 : GET /v1/category/{categoryCode}/product
	 * 응답 : List<Product>
	 * 테스트 메소드 명 : getCategoryProductList(String categoryCode)
	 * 테스트 메소드 기능 : 
	 * 테스트 시나리오 : 1. 유형별(A) 검색 시 총 63개 제품이 조회되는지 확인 - 계층 쿼리 이용 필요할듯
	 * 				2. 시트마스크(UMBB) 조회 시 9개 제품이 조회되는지 확인
	 */
	@Test
	void 카테고리별_제품_목록_조회() {
		List<Product> hierarchyProducts = productController.getCategoryProductList("A");
		assertThat(hierarchyProducts != null);
		assertEquals(63, hierarchyProducts.size());
		
		List<Product> products = productController.getCategoryProductList("UMBB");
		assertThat(products != null);
		assertEquals(9, products.size());
	}
	
	/**
	 * 요청 : POST /v1/cart
	 * 응답 : ResponseEntity
	 * 테스트 메소드 명 : addCartProduct(Cookie cookie, Long productId)
	 * 테스트 메소드 기능 : 전달된 요청에서 쿠키를 받아서 해당 제품을 장바구니에 저장
	 * 테스트 시나리오 : 1. 
	 */
//	@Test
//	void 장바구니_제품_등록() {
//		//Cookie cookie = new Cookie("name", "user1");
//		//ResponseEntity response = productController.addCartProduct(cookie, 11266L);
//		//response.getBody()
//	}
	
	/**
	 * 요청 : GET /v1/cart
	 * 응답 : List<Product>
	 * 테스트 메소드 명 : getCartProduct(Cookie cookie)
	 * 테스트 메소드 기능 : 
	 * 테스트 시나리오 : 1. 
	 */
//	@Test
//	void 장바구니_제품_목록_조회() {
//		//Cookie cookie = new Cookie("name", "user1");
//		//Page<Product> pagingProduct = getCartProduct(cookie);
//		//pagingProduct.get
//	}
	
	/**
	 * 요청 : GET /v1/product/{productId}/product
	 * 응답 : List<Product>
	 * 테스트 메소드 명 : getRelatedProduct(Long productId)
	 * 테스트 메소드 기능 : 전달된 제품코드와 카테고리 라인별(B)과 베스트(C)에 동시에 겹치는 제품 리스트 반환
	 * 테스트 시나리오 : 1. 
	 */
//	@Test
//	void 동일라인_베스트_제품_목록_조회() {
//		
//	}
	
	/**
	 * 요청 : GET /v1/product/{productId}/product
	 * 응답 : List<Product>
	 * 테스트 메소드 명 : getRelatedProducts(Long productId)
	 * 테스트 메소드 기능 : 전달된 제품코드와 카테고리 라인별(B)이 겹치는 제품 리스트 반환
	 * 테스트 시나리오 : 1. 
	 */
//	@Test
//	void 동일라인_제품_목록_조회() {
//		
//	}
	
}
