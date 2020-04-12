package com.study.design.pattern.behavior.visitor.file;

/**
 * @author wuwei
 * @title: BaseVisitable
 * @projectName CodingDesign
 * @description: 具体的数据结构
 * @date 2020-04-10 21:24
 */
public abstract class BaseVisitable {
    protected String mType;
    public BaseVisitable(String type) {
        this.mType = type;
    }
    abstract void accept(IVisitor visitor);

    abstract void doHandle();
}
