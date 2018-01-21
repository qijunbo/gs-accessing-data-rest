package com.sunwayworld.tdsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_methodclause")
public class MethodClause {

    @Id
    @Column(name = "methodclauseid")
    private Integer id;

    @Column(name = "methodclausecode")
    private String code;

    @Column(name = "methodclausename")
    private String name;

    @Column(name = "methodclausenameEn")
    private String nameEn;

    private String comments;

    private Integer methodid;

    private String gdspId;

    private String gdspCode;

    private String gdspMethodid;

    private String gdspMethodcode;

    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getMethodid() {
        return methodid;
    }

    public void setMethodid(Integer methodid) {
        this.methodid = methodid;
    }

    public String getGdspId() {
        return gdspId;
    }

    public void setGdspId(String gdspId) {
        this.gdspId = gdspId;
    }

    public String getGdspCode() {
        return gdspCode;
    }

    public void setGdspCode(String gdspCode) {
        this.gdspCode = gdspCode;
    }

    public String getGdspMethodid() {
        return gdspMethodid;
    }

    public void setGdspMethodid(String gdspMethodid) {
        this.gdspMethodid = gdspMethodid;
    }

    public String getGdspMethodcode() {
        return gdspMethodcode;
    }

    public void setGdspMethodcode(String gdspMethodcode) {
        this.gdspMethodcode = gdspMethodcode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}