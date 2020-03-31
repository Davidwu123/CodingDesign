package com.study.design.pattern.behavior.chain.wordFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: SensitiveWordFilterChain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-27 10:07
 */
public class SensitiveWordFilterChain {
    private List<ISensitiveWordFilter> mList = new ArrayList<>();

    public void addWordFilter(ISensitiveWordFilter wordFilter) {
        mList.add(wordFilter);
    }

    public boolean doFilter(String word) {
        for (ISensitiveWordFilter wordFilter : mList) {
            if (!wordFilter.doFilter(word)) return false;
        }
        return true;
    }
}
