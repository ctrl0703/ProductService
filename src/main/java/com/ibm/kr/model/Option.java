package com.ibm.kr.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Option {
	String id;
	String name;
	String barcode;
	int priority;

	public Option(String id, String name, String barcode, int priority) {
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.priority = priority;
	}
}
