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
public class Product {
	
	/* PRODUCTDT column */
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
	
	/* PRODUCTMT column */
	private String PRDNM;
	private String BASICDESC;
	private BigDecimal SALPRC;
	private String MNUFACTAREA;
	private String MNUFACT;
	private String REGID;
	private Date REGDATE;
	private String PRDIMG2ND;
	private String PRDIMG1ST;
	private String PRDIMG;
	private String PRDVOL;
	private String PRDENGNM;
	private String PRDNMS;
	private String P_TYPE;
	private String MAXPURQTY;
	private String PRDNMSCOLOR;
	private String USECAREDESC;
	private String QADESC;
	private String ASDESC;
	private String USEENDDATE;
	private String SALFL;
	private String MASSPURFL;
	private String SITEHIDEFL;
	private String PRDCOMPDESC;
	private String PRDUSEDESC;
	private String PRDAUDITDESC;
	private String PRDTYPECD;
	private String PRDDSPIMG1;
	private String PRDDSPIMG2;
	private String PRDDTLHTMLURL;
	private String HASHTAG;
	

}
