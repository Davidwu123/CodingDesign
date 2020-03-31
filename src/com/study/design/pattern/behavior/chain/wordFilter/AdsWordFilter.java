package com.study.design.pattern.behavior.chain.wordFilter;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: AdsWordFilter
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-27 10:05
 */
public class AdsWordFilter implements ISensitiveWordFilter {
    @Override
    public boolean doFilter(String word) {
        boolean legal = true;
        if (word.contains("sell")) legal = false;
        Log.d(this.getClass().getSimpleName(), "current filter is " + legal);
        return legal;
    }
}
