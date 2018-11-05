package com.dadagum.team.common.bean;

import java.util.Date;

public class Group {

    private Integer id;
    private String name;
    private Integer uid;
    private Date createTime;

    public Group(Integer id, String name, Integer uid, Date createTime) {
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.createTime = createTime;
    }

    public Group() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
