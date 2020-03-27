package com.ibm.kr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.controller.ProductController;
import com.ibm.kr.model.Product;

@SpringBootTest
class ProductTest {
	
	@Autowired
	ProductController productController;
	
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
		assertEquals(1, productNoOption.getOptions().size());
		
		Product productWithOption = productController.getProduct(16377L);
		assertEquals(10, productWithOption.getOptions().size());
	}
	
	@Test
	/*
	 * 14342 : BEST
	 * 16377 : BEST, new
	 * 11266 : NEW
	 * 13317 : none
	 */
	void 신제품_여부() {
		Product productNew = productController.getProduct(11266L);
		Product productNotNew = productController.getProduct(13317L);
		
		assertEquals(true, productNew.getIsNew());
		assertEquals(false, productNotNew.getIsNew());
	}

	/*
	 * 14342 : BEST
	 * 16377 : BEST, new
	 * 11266 : NEW
	 * 13317 : none
	 */
	@Test
	void 베트스제품_여부() {
		Product productBest = productController.getProduct(14342L);
		Product productNotBest = productController.getProduct(13317L);
		
		assertEquals(true, productBest.getIsBest());
		assertEquals(false, productNotBest.getIsBest());
	}
}
