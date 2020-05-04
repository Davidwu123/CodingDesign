package com.study.design.pattern.behavior.chain.image;


import com.study.design.common.Log;

/**
 * @author wuwei
 * @decription TODO
 * @date 2020-04-17 10:30
 * @email wei.wu@aispeech.com
 */
public class YuvImageRotateHandler implements IImageHandler {
    private static final String TAG = YuvImageRotateHandler.class.getSimpleName();

    @Override
    public AIImageData handle(IImageHandlerChain chain) {
        AIImageData imageData = chain.get();
        Log.d(TAG, "invoke rotate handle");
        //TODO do rotate
        imageData.setHeight(888);
        return chain.handle(imageData);
    }
}
