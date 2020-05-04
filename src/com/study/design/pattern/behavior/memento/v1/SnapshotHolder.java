package com.study.design.pattern.behavior.memento.v1;

import java.util.Stack;

/**
 * @author wuwei
 * @title: SnapshotHolder
 * @projectName CodingDesign
 * @description: 真正永久保存的地方
 * @date 2020-04-14 20:09
 */
public class SnapshotHolder {
    private Stack<InputText> mStack = new Stack<>();

    public InputText popSnapshot() {
        return mStack.pop();
    }

    public void pushSnapshot(InputText text) {
        InputText cloneInputText = new InputText();
        cloneInputText.setText(text.getText());
        mStack.push(cloneInputText);
        System.out.println("push: " + mStack.size());
        System.out.println("peek: " + mStack.peek());
        for (InputText inputText : mStack) {
            System.out.println("stack inputText: " + inputText.toString());
        }
    }

}
