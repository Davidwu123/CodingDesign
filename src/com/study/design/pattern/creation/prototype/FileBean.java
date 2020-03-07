package com.study.design.pattern.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: FileBean
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 21:26
 */
public class FileBean implements Cloneable{
    private String name;
    private int size;
    private CustomBean customBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CustomBean getCustomBean() {
        return customBean;
    }

    public void setCustomBean(CustomBean customBean) {
        this.customBean = customBean;
    }

    @Override
    protected FileBean clone() throws CloneNotSupportedException {
        return (FileBean) super.clone();
    }
}
