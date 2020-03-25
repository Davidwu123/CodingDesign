package com.study.design.pattern.behavior.strategy.sort;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: MapReduceSort
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:44
 */
public class MapReduceSort implements ISort {
    @Override
    public void sortFile(String filePath) {
        Log.d(MapReduceSort.class, "mapReduce");
    }
}
