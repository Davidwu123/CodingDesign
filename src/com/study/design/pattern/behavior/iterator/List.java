package com.study.design.pattern.behavior.iterator;

/**
 * @author wuwei
 * @title: List
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 21:11
 */
public interface List<T> {
    Iterator iterator();

    Iterator snapshotIterator();
}
