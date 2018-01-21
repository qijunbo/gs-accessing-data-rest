package com.sunwayworld.tdsp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_spec")
public class Spec {

    @Id
    @Column(name = "SPECID")
    private String id;

    @Column(name = "SPECCODE")
    private String code;

    @Column(name = "SPECNAME")
    private String name;

    @Column(name = "SPECNAME_EN")
    private String nameEn;

    @Column(name = "INTRODUCTION")
    private String introduction;

    @Column(name = "STATE")
    private String state;

    @Column(name = "SPECTYPE")
    private String type;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REVISION")
    private String revision;

    @Column(name = "CATEGORATE")
    private String categorate;

    @Column(name = "ICS")
    private String ICS;

    @Column(name = "CCS")
    private String CCS;

    @Column(name = "RELEASEDATE")
    private Date releaseDate;

    @Column(name = "IMPDATE")
    private Date impDate;

    @Column(name = "LASTAUDITDATE")
    private Date lastAuditDate;

    @Column(name = "AUDITRESULT")
    private String auditResult;

    @Column(name = "IMPORGNIZATION")
    private String impOrgnization;

    @Column(name = "COMMITORGNIZATION")
    private String commitOrgnization;

    @Column(name = "COMDEPARTMENT")
    private String comDepartment;

    @Column(name = "DRAFTORGNIZATION")
    private String draftOrgnization;

    @Column(name = "DRAFTPERSON")
    private String draftPerson;

    @Column(name = "REVIEWORGNIZATION")
    private String reviewOrgnization;

    @Column(name = "CONTACTPERSON")
    private String contactPerson;

    @Column(name = "CONTACTPHONE")
    private String contactPhone;

    @Column(name = "BULLETINNUMBER")
    private String bulletinNumber;

    @Column(name = "BULLETINDATE")
    private Date bulletinDate;

    @Column(name = "BULLETINTITLE")
    private String bulletinTitle;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "ISTESTSTANDARD")
    private boolean testStandard;

    @Column(name = "ISPRODUCTSTANDARD")
    private boolean productStandard;

}