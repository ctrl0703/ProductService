package com.ibm.kr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
	String id;
	List<Product> detail = new ArrayList<Product>();
	Date orderDate = new Date();
}
