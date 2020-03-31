package com.study.design.pattern.behavior.chain.wordFilter;

/**
 * @author wuwei
 * @title: IWordFilter
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-27 10:01
 */
public interface ISensitiveWordFilter {
    boolean doFilter(String word);
}
