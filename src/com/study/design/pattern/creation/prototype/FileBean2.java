package com.study.design.pattern.creation.prototype;

/**
 * @author wuwei
 * @title: FileBean2
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-07 21:31
 */
public class FileBean2 {
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
    public FileBean2 clone() {
        FileBean2 fileBean2 = new FileBean2();
        fileBean2.setName(name);
        fileBean2.setSize(size);
        fileBean2.setCustomBean(new CustomBean(customBean.getId()));
        return fileBean2;
    }
}
