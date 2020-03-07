package com.study.design.pattern.structure.compose.filesystem;

import java.util.ArrayList;

/**
 * @author wuwei
 * @title: Directory
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-06 21:50
 */
public class Directory extends AbsFileSystemNode {
    private ArrayList<AbsFileSystemNode> arrayList = new ArrayList();

    public Directory(String path) {
        super(path);
    }

    public Directory addFileSystemNode(AbsFileSystemNode systemNode) {
        arrayList.add(systemNode);
        return this;
    }

    /**
     * 采用递归方式来获取
     * 思路：文件夹下肯定有文件和文件夹，文件个数等于文件+文件夹下文件个数
     * @return
     */
    @Override
    public int getFileCount() {
        int totalCount = 0;
        for (AbsFileSystemNode node : arrayList) {
            totalCount += node.getFileCount();
        }
        return totalCount;
    }

    @Override
    public int getFileSize() {
        int totalSize = 0;
        for (AbsFileSystemNode node : arrayList) {
            totalSize += node.getFileSize();
        }
        return totalSize;
    }
}
