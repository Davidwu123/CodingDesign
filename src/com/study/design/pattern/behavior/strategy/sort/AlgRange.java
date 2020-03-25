package com.study.design.pattern.behavior.strategy.sort;

/**
 * @author wuwei
 * @title: AlgRange
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-23 20:48
 */
public class AlgRange {
    private int start;
    private int end;
    private ISort sort;

    public AlgRange(int start, int end, ISort sort) {
        this.start = start;
        this.end = end;
        this.sort = sort;
    }


    public boolean isRange(int size) {
        return start <= size && size < end;
    }

    public ISort getSort() {
        return this.sort;
    }
}
