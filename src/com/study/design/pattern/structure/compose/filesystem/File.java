package com.study.design.pattern.structure.compose.filesystem;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: File
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-03-06 21:48
 */
public class File extends AbsFileSystemNode {

    public File(String path) {
        super(path);
    }

    @Override
    public int getFileCount() {
        Log.d(File.class, "文件path " + path);
        return 1;
    }

    @Override
    public int getFileSize() {
        return DEFAULT_FILE_SIZE;
    }
}
