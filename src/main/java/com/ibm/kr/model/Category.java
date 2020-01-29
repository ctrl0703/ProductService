package com.ibm.kr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Category {
	@Id
	@Column(name="CATEGORY_CODE")
	private String id;
	private String name;
	
	@Column(name="CAT_ORDER")
	private int order;
}
