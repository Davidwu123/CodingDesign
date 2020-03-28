package com.study.design.pattern.behavior.strategy.chain.wordFilter;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: SexyWordFilter
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-27 10:02
 */
public class SexyWordFilter implements ISensitiveWordFilter {
    @Override
    public boolean doFilter(String word) {
        boolean legal = true;
        if (word.contains("fuck")) legal = false;
        Log.d(this.getClass().getSimpleName(), "current filter is " + legal);
        return legal;
    }
}
