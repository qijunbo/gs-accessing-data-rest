package com.sunwayworld.tdsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_producttype")
public class ProductType {

    @Id
    @Column(name = "PRODUCTTYPEID")
    private String id;

    @Column(name = "PRODUCTTYPECODE")
    private String code;

    @Column(name = "PRODUCTTYPENAME")
    private String name;

    @Column(name = "PAREANTID")
    private String pareantid;

    @Column(name = "COMMENTS")
    private String comments;

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPareantid() {
        return pareantid;
    }

    public String getComments() {
        return comments;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPareantid(String pareantid) {
        this.pareantid = pareantid;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}