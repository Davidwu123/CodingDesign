package com.study.design.pattern.bean;

import java.util.Date;

/**
 * @author wuwei
 * @title: FileBean
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-01 16:01
 */
public class FileBean {
    private String name;
    private long size;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
