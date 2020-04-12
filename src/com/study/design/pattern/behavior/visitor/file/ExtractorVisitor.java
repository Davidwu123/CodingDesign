package com.study.design.pattern.behavior.visitor.file;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ExtractorVisitor
 * @projectName CodingDesign
 * @description: 提取器
 * @date 2020-04-10 21:38
 */
public class ExtractorVisitor implements IVisitor {
    @Override
    public void visit(PdfVisitable pdfVisitable) {
        pdfVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor extract pdfVisitable");
    }

    @Override
    public void visit(WordVisitable wordVisitable) {
        wordVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor extract wordVisitable");
    }

    @Override
    public void visit(PptVisitable pptVisitable) {
        pptVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor extract pptVisitable");
    }
}
