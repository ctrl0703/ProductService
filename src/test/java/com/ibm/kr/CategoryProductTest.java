package com.ibm.kr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.controller.ProductController;
import com.ibm.kr.model.Product;

@SpringBootTest
class CategoryProductTest {
	
	@Autowired
	ProductController productController;
	
	/**
	 * 요청 : GET /v1/category/{categoryCode}/product
	 * 응답 : List<Product>
	 * 테스트 메소드 명 : getCategoryProductList(String categoryCode)
	 * 테스트 메소드 기능 : 
	 * 테스트 시나리오 : 1. 유형별(A) 검색 시 총 43개 제품이 조회되는지 확인 - 계층 쿼리 이용 필요할듯
	 * 				2. 시트마스크(UMBB) 조회 시 9개 제품이 조회되는지 확인
	 */
	@Test
	void 카테고리별_제품_목록_조회() {
		List<Product> hierarchyProducts = productController.getCategoryProductList("A");
		assertThat(hierarchyProducts != null);
		assertEquals(43, hierarchyProducts.size());
		
		List<Product> products = productController.getCategoryProductList("UMBB");
		assertThat(products != null);
		assertEquals(9, products.size());
	}
	
	@Test
	void 연관제품_목록_조회() {
		List<Product> relatedProducts = productController.getRelatedProductList(20858L, "B"); // 제주 왕벚꽃 라인 제품 리스트 20858, 20856, 20860, 20862이 나와야함 
		List<Product> relatedProducts2 = productController.getRelatedProductList(16762L, "B"); // 트루케어 라인 제품 리스트 16762, 12878, 25296, 18466, 18600, 24098, 13316, 13317, 26076, 25998, 15598, 25518, 25956, 14997, 18021, 16761, 25542, 25996, 14397, 17840이 나와야함
	}
}
