package com.ibm.kr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class ProductDT {
	
	@Id
	private BigDecimal PRDSEQ ;
	private String SAPPRDCD ;
	private String ORDERBY ;
	private String KINDNM ;
	private String STKSTAT ;
	private String UPDID ;
	private Date UPDDATE ;
	private String BARCODE ;
	private BigDecimal STDPRC ;
}
