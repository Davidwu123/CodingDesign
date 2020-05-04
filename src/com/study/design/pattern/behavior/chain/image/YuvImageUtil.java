package com.study.design.pattern.behavior.chain.image;


import com.study.design.common.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuwei
 * @description TODO
 * @date 2020-04-21 13:25
 * @email wei.wu@aispeech.com
 */
public class YuvImageUtil {
    private static final String TAG = YuvImageUtil.class.getSimpleName();
    public static AIImageData handle(AIImageData rawImage){
        List<IImageHandler> handlers = new ArrayList<>();
        handlers.add(new YuvImageRotateHandler());
        handlers.add(new YuvImageMirrorHandler());
        IImageHandlerChain chain = new YuvImageHandlerChain(handlers, 0, rawImage);
        AIImageData finalImageData = chain.handle(rawImage);
        Log.d(TAG, "getHeight" + finalImageData.getHeight());
        Log.d(TAG, "getWidth" + finalImageData.getWidth());
        return finalImageData;
    }
}
