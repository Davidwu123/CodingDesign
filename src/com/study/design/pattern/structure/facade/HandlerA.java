package com.study.design.pattern.structure.facade;

/**
 * @author wuwei
 * @title: HandlerA
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-05 15:10
 */
public class HandlerA {
    public String trim(String originalString) {
        return originalString.replace(" ", "");
    }
}
