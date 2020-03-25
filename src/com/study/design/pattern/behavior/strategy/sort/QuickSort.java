package com.study.design.pattern.behavior.strategy.sort;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: QuickSort
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:42
 */
public class QuickSort implements ISort {

    @Override
    public void sortFile(String filePath) {
        Log.d(QuickSort.class, "quick");
    }
}
