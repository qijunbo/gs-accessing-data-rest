package com.sunwayworld.tdsp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "st_inspection")
public class Inspection {

    @Id
    @Column(name = "nsid")
    private String id;

    @Column(name = "nsname")
    private String name;

    @Column(name = "nsyear")
    private String year;

    @Column(name = "nscode")
    private String code;

    @Column(name = "nsdate")
    private Date date;

    private String comments;

    @Column(name = "pnsid")
    private String parendId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getParendId() {
        return parendId;
    }

    public void setParendId(String parendId) {
        this.parendId = parendId;
    }

}