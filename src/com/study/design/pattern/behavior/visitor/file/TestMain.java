package com.study.design.pattern.behavior.visitor.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-10 21:40
 */
public class TestMain {


    public static void main(String[] args) {
        List<BaseVisitable> list = new ArrayList<>();
        list.add(new PdfVisitable(".pdf"));
        list.add(new WordVisitable(".word"));
        list.add(new PptVisitable(".ppt"));
        ExtractorVisitor extractorVisitor = new ExtractorVisitor();
        //这个使用方式也是主要原因
        for (BaseVisitable visitable : list) {
            visitable.accept(extractorVisitor);
        }
        CompressVisitor compressVisitor = new CompressVisitor();
        for (BaseVisitable visitable : list) {
            visitable.accept(compressVisitor);
        }
    }
}
