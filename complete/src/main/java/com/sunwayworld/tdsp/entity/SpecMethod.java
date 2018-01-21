package com.sunwayworld.tdsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_spec_method")
public class SpecMethod {

    @Id
    @Column(name = "SPEC_METHODID")
    private String id;

    @Column(name = "SPEC_METHODCODE")
    private String code;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "SPEC_TESTID")
    private String testId;

    @Column(name = "SPECID")
    private String specId;

    @Column(name = "METHODCLAUSEID")
    private String methodClauseId;

}