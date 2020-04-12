package com.study.design.pattern.behavior.visitor.file;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: CompressVisitor
 * @projectName CodingDesign
 * @description: 压缩器
 * @date 2020-04-10 21:40
 */
public class CompressVisitor implements IVisitor {
    @Override
    public void visit(PdfVisitable pdfVisitable) {
        pdfVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor compress pdfVisitable");
    }

    @Override
    public void visit(WordVisitable wordVisitable) {
        wordVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor compress wordVisitable");
    }

    @Override
    public void visit(PptVisitable pptVisitable) {
        pptVisitable.doHandle();
        Log.d(this.getClass().getSimpleName(), "visitor compress pptVisitable");
    }
}
