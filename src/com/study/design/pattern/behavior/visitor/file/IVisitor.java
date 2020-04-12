package com.study.design.pattern.behavior.visitor.file;

/**
 * @author wuwei
 * @title: IVisitor
 * @projectName CodingDesign
 * @description: 业务操作
 * @date 2020-04-10 21:23
 */
public interface IVisitor {
    //如果void visit()参数是空的，则和桥接模式类似，但是这样得每个数据结构都得实现一个，不能利用函数的重载特性了

    void visit(PdfVisitable pdfVisitable);

    void visit(WordVisitable wordVisitable);

    void visit(PptVisitable pptVisitable);
}
