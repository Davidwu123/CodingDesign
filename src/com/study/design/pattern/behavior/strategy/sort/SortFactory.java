package com.study.design.pattern.behavior.strategy.sort;

import com.study.design.common.Log;
import com.study.design.pattern.structure.compose.filesystem.File;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @title: SortFactory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:46
 */
public class SortFactory {

    private static final List<AlgRange> algs = new ArrayList<>();

    static {
        algs.add(new AlgRange(0, 100, new QuickSort()));
        algs.add(new AlgRange(100, 500, new HeapSort()));
        algs.add(new AlgRange(500, Integer.MAX_VALUE, new MapReduceSort()));
    }

    public static void sortFile(String filePath) {
        if (filePath == null) {
            return;
        }
        File file = new File(filePath);
        Log.d(SortFactory.class, "file size is " + file.getFileSize());
        for (AlgRange algRange : algs) {
            if (algRange.isRange(file.getFileSize())) {
                algRange.getSort().sortFile(filePath);
                break;
            }
        }
    }
}
