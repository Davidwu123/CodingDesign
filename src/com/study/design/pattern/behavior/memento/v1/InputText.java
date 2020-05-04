package com.study.design.pattern.behavior.memento.v1;

/**
 * @author wuwei
 * @title: InputText
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-14 20:09
 */
public class InputText {
    private StringBuilder mBuilder = new StringBuilder();

    public String getText() {
        return mBuilder.toString();
    }

    public void append(String s) {
        mBuilder.append(s);
    }

    public void setText(String text) {
        mBuilder.replace(0, mBuilder.length(), text);
    }

    @Override
    public String toString() {
        return "InputText{" +
                "mBuilder=" + mBuilder.toString() +
                '}';
    }
}
