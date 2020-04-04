package com.study.design.pattern.behavior.iterator;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: TestMain
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-01 20:45
 */
public class TestMain {
    public static void main(String[] args) {
//        executeDefaultIterator();
        executeLinkedListIterator();
    }

    private static void executeCustomIterator() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            arrayList.add("tt");
            Log.d(TestMain.class, "current item is " + iterator.getCurrentItem());
            iterator.next();
        }
    }

    private static void executeDefaultIterator() {
        java.util.ArrayList<String> list = new java.util.ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        java.util.Iterator iterator1 = list.iterator();
        java.util.Iterator iterator2 = list.iterator();
        iterator1.next();
        iterator1.remove();
        iterator2.next();
    }

    private static void executeLinkedListIterator() {
        java.util.LinkedList<String> list = new java.util.LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        java.util.Iterator iterator1 = list.iterator();
        java.util.Iterator iterator2 = list.iterator();
        iterator1.next();
        iterator1.remove();
        iterator2.next();
    }
}
