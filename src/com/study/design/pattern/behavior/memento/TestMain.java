package com.study.design.pattern.behavior.memento;

import com.study.design.pattern.behavior.memento.v1.InputText;
import com.study.design.pattern.behavior.memento.v1.SnapshotHolder;
import com.study.design.pattern.behavior.memento.v2.V2InputText;
import com.study.design.pattern.behavior.memento.v2.V2Snapshot;
import com.study.design.pattern.behavior.memento.v2.V2SnapshotHolder;

import java.util.Scanner;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-14 19:45
 */
public class TestMain {
    public static void main(String[] args) {
//        executeV1();
        executeV2();
    }


    private static void executeV2() {
        V2InputText inputText = new V2InputText();
        V2SnapshotHolder snapshotsHolder = new V2SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.toString());//打印直接打印当前最新的即可，用不到快照
            } else if (input.equals(":undo")) {
                V2Snapshot snapshot = snapshotsHolder.pop();
                inputText.restoreSnapshot(snapshot);
                System.out.println("final text: " + inputText.toString());
            } else {
                snapshotsHolder.push(inputText.createSnapshot());//最新放的还是上一次的结果
                inputText.append(input);//放的是最新的结果，临时的
            }
        }
    }


    private static void executeV1() {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.toString());
            } else if (input.equals(":undo")) {
                InputText snapshot = snapshotsHolder.popSnapshot();
                System.out.println("snapshot: " + snapshot.toString());
                inputText.setText(snapshot.getText());
            } else {
                System.out.println("inputText: " + inputText.toString());
                System.out.println("input: " + input);
                snapshotsHolder.pushSnapshot(inputText);//最新放的还是上一次的结果
                inputText.append(input);//放的是最新的结果，临时的
            }
        }
    }
}
