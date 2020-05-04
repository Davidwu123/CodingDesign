package com.study.design.pattern.behavior.memento.v2;

/**
 * @author wuwei
 * @title: V2Snapshot
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-14 20:35
 */
public class V2Snapshot {
    private String text;

    public V2Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
