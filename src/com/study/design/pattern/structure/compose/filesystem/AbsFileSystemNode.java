package com.study.design.pattern.structure.compose.filesystem;


/**
 * @author wuwei
 * @title: AbsFileSystemNode
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-06 21:37
 */
public abstract class AbsFileSystemNode {
    protected static final int DEFAULT_FILE_SIZE = 1024;
    protected String path;

    public AbsFileSystemNode(String path) {
        this.path = path;
    }

    public abstract int getFileCount();

    public abstract int getFileSize();
}
