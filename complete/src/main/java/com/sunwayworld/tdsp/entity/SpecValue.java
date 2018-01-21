package com.sunwayworld.tdsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_spec_value")
public class SpecValue {

    @Id
    @Column(name = "SPEC_VALUEID")
    private String id;
    
    @Column(name = "SPEC_VALUECODE")
    private String code;
    
    @Column(name = "SPECID")
    private String specId;
    
    @Column(name = "SPEC_PRODUCTID")
    private String specProductId;
    
    @Column(name = "LIMITS")
    private String limits;
    
    @Column(name = "LOW")
    private String low;
    
    @Column(name = "HIGH")
    private String high;
    
    @Column(name = "UNITS")
    private String unit;
    
    @Column(name = "PICTURE")
    private String picture;

    @Column(name = "SPEC_LEVEL")
    private String level;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "spec_testid")
    private String testId;

}