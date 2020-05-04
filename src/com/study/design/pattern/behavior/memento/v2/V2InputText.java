package com.study.design.pattern.behavior.memento.v2;

/**
 * @author wuwei
 * @title: V2InputText
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-14 20:34
 */
public class V2InputText {
    private StringBuilder mBuilder = new StringBuilder();

    public void append(String s) {
        mBuilder.append(s);
    }

    public V2Snapshot createSnapshot() {
        return new V2Snapshot(mBuilder.toString());
    }

    /**
     * 将快照中的数据覆盖进来
     * @param snapshot
     */
    public void restoreSnapshot(V2Snapshot snapshot) {
        this.mBuilder.replace(0, mBuilder.length(), snapshot.getText());
    }

    @Override
    public String toString() {
        return mBuilder.toString();
    }
}
