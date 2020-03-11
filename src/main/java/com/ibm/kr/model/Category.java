package com.ibm.kr.model;

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

}
