package com.sunwayworld.tdsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_spec_test")
public class SpecTest {

    @Id
    @Column(name = "SPEC_TESTID")
    private String id;

    @Column(name = "SPEC_TESTCODE")
    private String code;

    @Column(name = "SPECTESTTYPE")
    private String type;

    @Column(name = "SPECTESTNAME")
    private String name;

    @Column(name = "SPECTESTNAME_EN")
    private String nameEn;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "SORTER")
    private int sorter;

    @Column(name = "SPECID")
    private String specId;

    @Column(name = "NSID")
    private String NSID;

    @Column(name = "NSDID")
    private String NSDID;

}