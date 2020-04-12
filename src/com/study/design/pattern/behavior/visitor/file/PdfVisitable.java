package com.study.design.pattern.behavior.visitor.file;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: PdfVisitable
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-10 21:34
 */
public class PdfVisitable extends BaseVisitable {

    public PdfVisitable(String type) {
        super(type);
    }



    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    void doHandle() {
        Log.e(this.getClass().getSimpleName(), "file type is " + mType);
    }
}
