package com.ibm.kr.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Page<T> {
	int totalCount;
	int pageSize = 20;
	int page;
	String sort;
	
	List<T> content = new ArrayList<T>();
}
