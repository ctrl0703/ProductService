package com.ibm.kr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Product {
	
	@Id
	@Column(name="CODE")
	private String id;
	
	private String name;
	private BigDecimal price;
	private String category;
	//private int stockCount;
	//private double reviewRating;
	//private boolean allowSale;
	//private String defaultImageUrl;
	//private String mouseOverImageUrl;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	private String createId;
	

}
