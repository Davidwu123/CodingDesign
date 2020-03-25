package com.study.design.pattern.behavior.strategy.sort;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: HeapSort
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:43
 */
public class HeapSort implements ISort {
    @Override
    public void sortFile(String filePath) {
        Log.d(HeapSort.class, "heap");
    }
}
