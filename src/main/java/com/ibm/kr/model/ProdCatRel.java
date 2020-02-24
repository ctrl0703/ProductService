package com.ibm.kr.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class ProdCatRel {
	
	@Id
	@Column(name="CATEGORY_CODE")
	private String id;
	private BigDecimal prdseq;
	
	@Transient
	private int pageStart;
	@Transient
	private int pageEnd;
	@Transient
	private int pageTotCnt;
}
