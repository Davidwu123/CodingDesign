package com.study.design.pattern.behavior.iterator;

/**
 * @author wuwei
 * @title: Iterator
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 13:34
 */
public interface Iterator<T> {

    /**
     * 判断是否还有元素：
     * true:cursor <= size;
     * false:cursor > size.
     * @return
     */
    boolean hasNext();

    /**
     * 游标下移
     */
    void next();

    /**
     * 获取游标所在当前位置
     * @return
     */
    T getCurrentItem();
}
