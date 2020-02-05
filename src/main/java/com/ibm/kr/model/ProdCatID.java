package com.ibm.kr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ProdCatID implements Serializable {
    @Column(name = "CATRELID")
    private int catRelId;
 
    @Column(name = "PRDSEQ")
    private String prdSeq;
}
