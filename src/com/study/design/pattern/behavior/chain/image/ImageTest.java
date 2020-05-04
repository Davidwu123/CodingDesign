package com.study.design.pattern.behavior.chain.image;

import com.study.design.common.Log;

/**
 * @author wuwei
 * @title: ImageTest
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-04-21 13:35
 */
public class ImageTest {
    public static void main(String[] arg) {
        AIImageData rawImageData = AIImageData.emptyData();
        AIImageData retImageData = YuvImageUtil.handle(rawImageData);
        Log.d(ImageTest.class, "retImageData width " + retImageData.getWidth());
        Log.d(ImageTest.class, "retImageData height " + retImageData.getHeight());
    }
}
