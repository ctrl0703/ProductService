package com.ibm.kr.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {
	private String id;
	private String name;
	private int order = 0;
	private String superId;
	private List<Category> subCategories = new ArrayList<Category>();
	private List<Product> products = new ArrayList<Product>();
}
