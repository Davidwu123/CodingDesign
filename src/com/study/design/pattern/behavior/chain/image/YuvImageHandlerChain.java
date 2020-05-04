package com.study.design.pattern.behavior.chain.image;


import java.util.List;

/**
 * @author wuwei
 * @description YUV图片处理(旋转,镜像)责任链
 * @date 2020-04-21 11:55
 * @email wei.wu@aispeech.com
 */
public class YuvImageHandlerChain implements IImageHandlerChain{
    private List<IImageHandler> imageHandlers;
    private int index;
    private AIImageData imageData;


    public YuvImageHandlerChain(List<IImageHandler> iImageHandlers, int index, AIImageData imageData){
        this.imageHandlers = iImageHandlers;
        this.index = index;
        this.imageData = imageData;
    }

    @Override
    public AIImageData handle(AIImageData rawImageData) {
        if (index >= imageHandlers.size()) throw new AssertionError();
        YuvImageHandlerChain next = new YuvImageHandlerChain(
                imageHandlers, index + 1, rawImageData);
        IImageHandler imageHandler = imageHandlers.get(index);
        return imageHandler.handle(next);
    }

    @Override
    public AIImageData get() {
        return imageData;
    }
}
