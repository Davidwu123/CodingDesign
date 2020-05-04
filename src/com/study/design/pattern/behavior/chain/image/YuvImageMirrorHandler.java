package com.study.design.pattern.behavior.chain.image;


import com.study.design.common.Log;

/**
 * @author wuwei
 * @description TODO
 * @date 2020-04-21 13:13
 * @email wei.wu@aispeech.com
 */
public class YuvImageMirrorHandler implements IImageHandler {
    private final static String TAG = YuvImageMirrorHandler.class.getSimpleName();
    @Override
    public AIImageData handle(IImageHandlerChain chain) {
        Log.d(TAG, "last, mirror handler invoke before");
        AIImageData imageData = chain.get();
        //TODO do mirror
        imageData.setWidth(999);
        return imageData;
    }

}
