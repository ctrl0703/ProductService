package com.ibm.kr.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
	Long id;
	String name;
	String imageUrl;
	String header;
	String basicDescription;
	String hashTag;
	BigDecimal price;
	Boolean restrictCoupon;
	Boolean restrictPoint;
	Boolean restricNotMember;
	Boolean restrictBuyCount;
	String note;
	String detailHtmlUrl;
	String volume;
	String manufacturer;
	String manufacturedArea;
	String useEndDate;
	String useDescription;
	String skin;
	String auditDescription;
	String QADescription;
	String element;
	String useCareDescription;
	String ASDescription;
}
