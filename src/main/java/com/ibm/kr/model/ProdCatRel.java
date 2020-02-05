package com.ibm.kr.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class ProdCatRel {
	
	@EmbeddedId
    private ProdCatID prodCatId;
}
