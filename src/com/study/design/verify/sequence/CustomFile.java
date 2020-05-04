package com.study.design.verify.sequence;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: CustomFile
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-08 08:45
 */
public class CustomFile {
    static {
        Log.d(CustomFile.class, "CustomFile static 2");
    }

    {
        Log.d(CustomFile.class, "CustomFile no static 3");
    }

    public CustomFile() {
        Log.d(CustomFile.class, "CustomFile constructor 4");
    }
}
