package com.study.design.pattern.behavior.memento.v2;

import java.util.Stack;

/**
 * @author wuwei
 * @title: V2SnapshotHolder
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-14 20:38
 */
public class V2SnapshotHolder {
    private Stack<V2Snapshot> mStack = new Stack<>();

    public V2Snapshot pop() {
        return mStack.pop();
    }

    public void push(V2Snapshot snapshot) {
        mStack.push(snapshot);
    }
}
